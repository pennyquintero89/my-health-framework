package com.pennyquin.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

/**
 * HealthDataRequest
 */

@Deprecated
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-29T20:36:51.586484600+02:00[Europe/Berlin]", comments = "Generator version: 7.14.0")
public class HealthDataRequest {

    private Integer totalSteps;

    private Integer totalActiveMinutes;

    private Double totalCaloriesBurned;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    public HealthDataRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HealthDataRequest(Integer totalSteps, Integer totalActiveMinutes, Double totalCaloriesBurned, LocalDate date) {
        this.totalSteps = totalSteps;
        this.totalActiveMinutes = totalActiveMinutes;
        this.totalCaloriesBurned = totalCaloriesBurned;
        this.date = date;
    }

    public HealthDataRequest totalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
        return this;
    }

    /**
     * Total number of steps taken
     * minimum: 0
     *
     * @return totalSteps
     */
    @NotNull
    @Min(0)
    @Schema(name = "totalSteps", example = "8542", description = "Total number of steps taken", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("totalSteps")
    public Integer getTotalSteps() {
        return totalSteps;
    }

    public void setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
    }

    public HealthDataRequest totalActiveMinutes(Integer totalActiveMinutes) {
        this.totalActiveMinutes = totalActiveMinutes;
        return this;
    }

    /**
     * Total active minutes
     * minimum: 0
     *
     * @return totalActiveMinutes
     */
    @NotNull
    @Min(0)
    @Schema(name = "totalActiveMinutes", example = "67", description = "Total active minutes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("totalActiveMinutes")
    public Integer getTotalActiveMinutes() {
        return totalActiveMinutes;
    }

    public void setTotalActiveMinutes(Integer totalActiveMinutes) {
        this.totalActiveMinutes = totalActiveMinutes;
    }

    public HealthDataRequest totalCaloriesBurned(Double totalCaloriesBurned) {
        this.totalCaloriesBurned = totalCaloriesBurned;
        return this;
    }

    /**
     * Total calories burned
     * minimum: 0
     *
     * @return totalCaloriesBurned
     */
    @NotNull
    @DecimalMin("0")
    @Schema(name = "totalCaloriesBurned", example = "2180.5", description = "Total calories burned", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("totalCaloriesBurned")
    public Double getTotalCaloriesBurned() {
        return totalCaloriesBurned;
    }

    public void setTotalCaloriesBurned(Double totalCaloriesBurned) {
        this.totalCaloriesBurned = totalCaloriesBurned;
    }

    public HealthDataRequest date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Date in ISO 8601 format (YYYY-MM-DD)
     *
     * @return date
     */
    @NotNull
    @Valid
    @Schema(name = "date", example = "2024-03-15", description = "Date in ISO 8601 format (YYYY-MM-DD)", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("date")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthDataRequest healthDataRequest = (HealthDataRequest) o;
        return Objects.equals(this.totalSteps, healthDataRequest.totalSteps) &&
                Objects.equals(this.totalActiveMinutes, healthDataRequest.totalActiveMinutes) &&
                Objects.equals(this.totalCaloriesBurned, healthDataRequest.totalCaloriesBurned) &&
                Objects.equals(this.date, healthDataRequest.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalSteps, totalActiveMinutes, totalCaloriesBurned, date);
    }

    @Override
    public String toString() {
        String sb = "class HealthDataRequest {\n" +
                "    totalSteps: " + toIndentedString(totalSteps) + "\n" +
                "    totalActiveMinutes: " + toIndentedString(totalActiveMinutes) + "\n" +
                "    totalCaloriesBurned: " + toIndentedString(totalCaloriesBurned) + "\n" +
                "    date: " + toIndentedString(date) + "\n" +
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

