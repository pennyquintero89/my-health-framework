package com.pennyquin.healthframework.dto;

public class AuthenticationDTO {

    private String deviceId;
    private String userId;
    private String accessToken;
    private Long expiresIn;

    public AuthenticationDTO() {}

    public AuthenticationDTO(String deviceId, String userId, String accessToken, Long expiresIn) {
        this.deviceId = deviceId;
        this.userId = userId;
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }
}