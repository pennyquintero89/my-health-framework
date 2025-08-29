package com.pennyquin.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-29T20:36:51.586484600+02:00[Europe/Berlin]", comments = "Generator version: 7.14.0")
public class ErrorResponse {

    private String error;

    private String message;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private @Nullable OffsetDateTime timestamp;

    public ErrorResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }

    public ErrorResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Error code
     *
     * @return error
     */
    @NotNull
    @Schema(name = "error", example = "INVALID_REQUEST", description = "Error code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ErrorResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Human-readable error message
     *
     * @return message
     */
    @NotNull
    @Schema(name = "message", example = "Invalid device ID provided", description = "Human-readable error message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponse timestamp(@Nullable OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Error timestamp
     *
     * @return timestamp
     */
    @Valid
    @Schema(name = "timestamp", example = "2024-03-15T10:30Z", description = "Error timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timestamp")
    public @Nullable OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(@Nullable OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) o;
        return Objects.equals(this.error, errorResponse.error) &&
                Objects.equals(this.message, errorResponse.message) &&
                Objects.equals(this.timestamp, errorResponse.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, message, timestamp);
    }

    @Override
    public String toString() {
        String sb = "class ErrorResponse {\n" +
                "    error: " + toIndentedString(error) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    timestamp: " + toIndentedString(timestamp) + "\n" +
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

