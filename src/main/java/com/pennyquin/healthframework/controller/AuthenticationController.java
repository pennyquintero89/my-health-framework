package com.pennyquin.healthframework.controller;

import com.pennyquin.healthframework.dto.AuthenticationDTO;
import com.pennyquin.healthframework.service.AuthenticationService;
import com.pennyquin.openapi.api.AuthApi;
import com.pennyquin.openapi.model.TokenRequest;
import com.pennyquin.openapi.model.TokenResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController implements AuthApi {


    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private AuthenticationService authenticationService;

    @Override
    public ResponseEntity<TokenResponse> authTokenPost(TokenRequest tokenRequest) {
        try {
            if (tokenRequest == null || tokenRequest.getDeviceId() == null) {
                return ResponseEntity.badRequest().build();
            }

            AuthenticationDTO authDTO = authenticationService.authenticate(tokenRequest.getDeviceId());

            TokenResponse response = new TokenResponse();
            response.setAccessToken(authDTO.getAccessToken());
            response.setExpiresIn(authDTO.getExpiresIn());

            return ResponseEntity.ok(response);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}