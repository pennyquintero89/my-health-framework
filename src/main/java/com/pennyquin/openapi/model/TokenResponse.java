package com.pennyquin.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * TokenResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-29T20:36:51.586484600+02:00[Europe/Berlin]", comments = "Generator version: 7.14.0")
public class TokenResponse {

    private String accessToken;

    private Long expiresIn;

    public TokenResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TokenResponse(String accessToken, Long expiresIn) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }

    public TokenResponse accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * OAuth 2.0 access token
     *
     * @return accessToken
     */
    @NotNull
    @Schema(name = "accessToken", example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...", description = "OAuth 2.0 access token", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public TokenResponse expiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Token expiration time in seconds
     *
     * @return expiresIn
     */
    @NotNull
    @Schema(name = "expiresIn", example = "3600", description = "Token expiration time in seconds", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("expiresIn")
    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) o;
        return Objects.equals(this.accessToken, tokenResponse.accessToken) &&
                Objects.equals(this.expiresIn, tokenResponse.expiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, expiresIn);
    }

    @Override
    public String toString() {
        String sb = "class TokenResponse {\n" +
                "    accessToken: " + toIndentedString(accessToken) + "\n" +
                "    expiresIn: " + toIndentedString(expiresIn) + "\n" +
                "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

