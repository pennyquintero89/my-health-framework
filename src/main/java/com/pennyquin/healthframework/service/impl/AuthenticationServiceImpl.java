package com.pennyquin.healthframework.service.impl;

import com.pennyquin.healthframework.dto.AuthenticationDTO;
import com.pennyquin.healthframework.entity.User;
import com.pennyquin.healthframework.repository.UserRepository;
import com.pennyquin.healthframework.service.AuthenticationService;
import com.pennyquin.openapi.configuration.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Profile({"qa", "prod"})
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public AuthenticationDTO authenticate(String deviceId) {
        User user = userRepository.findByDeviceId(deviceId)
                .orElseThrow(() -> new InsufficientAuthenticationException("User does not exist"));

        user.setLastAccessAt(LocalDateTime.now());
        userRepository.save(user);

        String token = jwtTokenProvider.generateToken(user.getId());
        Long expiresIn = (long) jwtTokenProvider.getExpirationInSeconds();

        return new AuthenticationDTO(deviceId, user.getId(), token, expiresIn);
    }
}