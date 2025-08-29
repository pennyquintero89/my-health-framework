package com.pennyquin.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuccessResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-29T20:36:51.586484600+02:00[Europe/Berlin]", comments = "Generator version: 7.14.0")
public class SuccessResponse {

    private String message;

    public SuccessResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SuccessResponse(String message) {
        this.message = message;
    }

    public SuccessResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Success message
     *
     * @return message
     */
    @NotNull
    @Schema(name = "message", example = "Health data submitted successfully", description = "Success message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SuccessResponse successResponse = (SuccessResponse) o;
        return Objects.equals(this.message, successResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        String sb = "class SuccessResponse {\n" +
                "    message: " + toIndentedString(message) + "\n" +
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

