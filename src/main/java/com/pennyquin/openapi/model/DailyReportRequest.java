package com.pennyquin.openapi.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DailyReportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-01T14:09:06.896297600+02:00[Europe/Berlin]", comments = "Generator version: 7.15.0")
public class DailyReportRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate date;

  private Integer steps;

  private Integer stand;

  private Double distance;

  private Integer activeMinutes;

  private Double activeCalories;

  private Double totalCalories;

  private Double basalMetabolicRate;

  private Integer averageHeartRate;

  private Integer averageRestingHeartRate;

  private String timeZone;

  public DailyReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DailyReportRequest(LocalDate date, Integer steps, Integer stand, Double distance, Integer activeMinutes, Double activeCalories, Double totalCalories, Double basalMetabolicRate, Integer averageHeartRate, Integer averageRestingHeartRate, String timeZone) {
    this.date = date;
    this.steps = steps;
    this.stand = stand;
    this.distance = distance;
    this.activeMinutes = activeMinutes;
    this.activeCalories = activeCalories;
    this.totalCalories = totalCalories;
    this.basalMetabolicRate = basalMetabolicRate;
    this.averageHeartRate = averageHeartRate;
    this.averageRestingHeartRate = averageRestingHeartRate;
    this.timeZone = timeZone;
  }

  public DailyReportRequest date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Date in ISO 8601 format (YYYY-MM-DD)
   * @return date
   */
  @NotNull @Valid 
  @Schema(name = "date", example = "2024-03-15", description = "Date in ISO 8601 format (YYYY-MM-DD)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public DailyReportRequest steps(Integer steps) {
    this.steps = steps;
    return this;
  }

  /**
   * Total number of steps taken
   * minimum: 0
   * @return steps
   */
  @NotNull @Min(0) 
  @Schema(name = "steps", example = "8542", description = "Total number of steps taken", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("steps")
  public Integer getSteps() {
    return steps;
  }

  public void setSteps(Integer steps) {
    this.steps = steps;
  }

  public DailyReportRequest stand(Integer stand) {
    this.stand = stand;
    return this;
  }

  /**
   * Total stand hours
   * minimum: 0
   * @return stand
   */
  @NotNull @Min(0) 
  @Schema(name = "stand", example = "10", description = "Total stand hours", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stand")
  public Integer getStand() {
    return stand;
  }

  public void setStand(Integer stand) {
    this.stand = stand;
  }

  public DailyReportRequest distance(Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Total distance taken (meters)
   * minimum: 0
   * @return distance
   */
  @NotNull @DecimalMin("0") 
  @Schema(name = "distance", example = "2180.5", description = "Total distance taken (meters)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public DailyReportRequest activeMinutes(Integer activeMinutes) {
    this.activeMinutes = activeMinutes;
    return this;
  }

  /**
   * Total active minutes
   * minimum: 0
   * @return activeMinutes
   */
  @NotNull @Min(0) 
  @Schema(name = "activeMinutes", example = "67", description = "Total active minutes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activeMinutes")
  public Integer getActiveMinutes() {
    return activeMinutes;
  }

  public void setActiveMinutes(Integer activeMinutes) {
    this.activeMinutes = activeMinutes;
  }

  public DailyReportRequest activeCalories(Double activeCalories) {
    this.activeCalories = activeCalories;
    return this;
  }

  /**
   * Total active calories burned (kilocalorie)
   * minimum: 0
   * @return activeCalories
   */
  @NotNull @DecimalMin("0") 
  @Schema(name = "activeCalories", example = "2180.5", description = "Total active calories burned (kilocalorie)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activeCalories")
  public Double getActiveCalories() {
    return activeCalories;
  }

  public void setActiveCalories(Double activeCalories) {
    this.activeCalories = activeCalories;
  }

  public DailyReportRequest totalCalories(Double totalCalories) {
    this.totalCalories = totalCalories;
    return this;
  }

  /**
   * Total daily calories burned (kilocalorie)
   * minimum: 0
   * @return totalCalories
   */
  @NotNull @DecimalMin("0") 
  @Schema(name = "totalCalories", example = "3000.5", description = "Total daily calories burned (kilocalorie)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalCalories")
  public Double getTotalCalories() {
    return totalCalories;
  }

  public void setTotalCalories(Double totalCalories) {
    this.totalCalories = totalCalories;
  }

  public DailyReportRequest basalMetabolicRate(Double basalMetabolicRate) {
    this.basalMetabolicRate = basalMetabolicRate;
    return this;
  }

  /**
   * Basal metabolic rate (kilocalorie)
   * minimum: 0
   * @return basalMetabolicRate
   */
  @NotNull @DecimalMin("0") 
  @Schema(name = "basalMetabolicRate", example = "1000.5", description = "Basal metabolic rate (kilocalorie)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("basalMetabolicRate")
  public Double getBasalMetabolicRate() {
    return basalMetabolicRate;
  }

  public void setBasalMetabolicRate(Double basalMetabolicRate) {
    this.basalMetabolicRate = basalMetabolicRate;
  }

  public DailyReportRequest averageHeartRate(Integer averageHeartRate) {
    this.averageHeartRate = averageHeartRate;
    return this;
  }

  /**
   * Average Heart Rate
   * minimum: 0
   * @return averageHeartRate
   */
  @NotNull @Min(0) 
  @Schema(name = "averageHeartRate", example = "67", description = "Average Heart Rate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("averageHeartRate")
  public Integer getAverageHeartRate() {
    return averageHeartRate;
  }

  public void setAverageHeartRate(Integer averageHeartRate) {
    this.averageHeartRate = averageHeartRate;
  }

  public DailyReportRequest averageRestingHeartRate(Integer averageRestingHeartRate) {
    this.averageRestingHeartRate = averageRestingHeartRate;
    return this;
  }

  /**
   * Average Heart Rate
   * minimum: 0
   * @return averageRestingHeartRate
   */
  @NotNull @Min(0) 
  @Schema(name = "averageRestingHeartRate", example = "67", description = "Average Heart Rate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("averageRestingHeartRate")
  public Integer getAverageRestingHeartRate() {
    return averageRestingHeartRate;
  }

  public void setAverageRestingHeartRate(Integer averageRestingHeartRate) {
    this.averageRestingHeartRate = averageRestingHeartRate;
  }

  public DailyReportRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Timezone Offset value
   * @return timeZone
   */
  @NotNull 
  @Schema(name = "timeZone", example = "-0500", description = "Timezone Offset value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyReportRequest dailyReportRequest = (DailyReportRequest) o;
    return Objects.equals(this.date, dailyReportRequest.date) &&
        Objects.equals(this.steps, dailyReportRequest.steps) &&
        Objects.equals(this.stand, dailyReportRequest.stand) &&
        Objects.equals(this.distance, dailyReportRequest.distance) &&
        Objects.equals(this.activeMinutes, dailyReportRequest.activeMinutes) &&
        Objects.equals(this.activeCalories, dailyReportRequest.activeCalories) &&
        Objects.equals(this.totalCalories, dailyReportRequest.totalCalories) &&
        Objects.equals(this.basalMetabolicRate, dailyReportRequest.basalMetabolicRate) &&
        Objects.equals(this.averageHeartRate, dailyReportRequest.averageHeartRate) &&
        Objects.equals(this.averageRestingHeartRate, dailyReportRequest.averageRestingHeartRate) &&
        Objects.equals(this.timeZone, dailyReportRequest.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, steps, stand, distance, activeMinutes, activeCalories, totalCalories, basalMetabolicRate, averageHeartRate, averageRestingHeartRate, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyReportRequest {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    stand: ").append(toIndentedString(stand)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    activeMinutes: ").append(toIndentedString(activeMinutes)).append("\n");
    sb.append("    activeCalories: ").append(toIndentedString(activeCalories)).append("\n");
    sb.append("    totalCalories: ").append(toIndentedString(totalCalories)).append("\n");
    sb.append("    basalMetabolicRate: ").append(toIndentedString(basalMetabolicRate)).append("\n");
    sb.append("    averageHeartRate: ").append(toIndentedString(averageHeartRate)).append("\n");
    sb.append("    averageRestingHeartRate: ").append(toIndentedString(averageRestingHeartRate)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("}");
    return sb.toString();
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

