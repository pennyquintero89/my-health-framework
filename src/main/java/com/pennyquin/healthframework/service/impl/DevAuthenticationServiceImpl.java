package com.pennyquin.healthframework.service.impl;

import com.pennyquin.healthframework.dto.AuthenticationDTO;
import com.pennyquin.healthframework.entity.User;
import com.pennyquin.healthframework.repository.UserRepository;
import com.pennyquin.healthframework.service.AuthenticationService;
import com.pennyquin.openapi.configuration.security.JwtTokenProvider;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Profile("dev")
public class DevAuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;

    public DevAuthenticationServiceImpl(UserRepository userRepository, JwtTokenProvider jwtTokenProvider) {
        this.userRepository = userRepository;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public AuthenticationDTO authenticate(String deviceId) {
        User user = userRepository.findByDeviceId(deviceId)
                .orElseGet(() -> createNewUser(deviceId));

        user.setLastAccessAt(LocalDateTime.now());
        userRepository.save(user);

        String token = jwtTokenProvider.generateToken(user.getId());
        Long expiresIn = (long) jwtTokenProvider.getExpirationInSeconds();

        return new AuthenticationDTO(deviceId, user.getId(), token, expiresIn);
    }

    private User createNewUser(String deviceId) {
        User user = new User();
        user.setDeviceId(deviceId);
        user.setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }
}
