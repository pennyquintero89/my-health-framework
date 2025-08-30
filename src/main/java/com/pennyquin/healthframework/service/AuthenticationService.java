package com.pennyquin.healthframework.service;

import com.pennyquin.healthframework.dto.AuthenticationDTO;

public interface AuthenticationService {
    AuthenticationDTO authenticate(String deviceId);
}