package com.pennyquin.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * TokenRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-29T20:36:51.586484600+02:00[Europe/Berlin]", comments = "Generator version: 7.14.0")
public class TokenRequest {

    private String deviceId;

    public TokenRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TokenRequest(String deviceId) {
        this.deviceId = deviceId;
    }

    public TokenRequest deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Unique identifier for the requesting device
     *
     * @return deviceId
     */
    @NotNull
    @Size(min = 1, max = 255)
    @Schema(name = "deviceId", example = "android-device-12345", description = "Unique identifier for the requesting device", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenRequest tokenRequest = (TokenRequest) o;
        return Objects.equals(this.deviceId, tokenRequest.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId);
    }

    @Override
    public String toString() {
        String sb = "class TokenRequest {\n" +
                "    deviceId: " + toIndentedString(deviceId) + "\n" +
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

