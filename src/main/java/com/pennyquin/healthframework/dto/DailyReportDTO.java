package com.pennyquin.healthframework.dto;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DailyReportDTO {

    private String userId;
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

    public DailyReportDTO() {
    }

    public DailyReportDTO(String userId, LocalDate date, Integer steps, Integer stand, Double distance, Integer activeMinutes, Double activeCalories, Double totalCalories, Double basalMetabolicRate, Integer averageHeartRate, Integer averageRestingHeartRate, String timeZone) {
        this.userId = userId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }

    public Integer getStand() {
        return stand;
    }

    public void setStand(Integer stand) {
        this.stand = stand;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getActiveMinutes() {
        return activeMinutes;
    }

    public void setActiveMinutes(Integer activeMinutes) {
        this.activeMinutes = activeMinutes;
    }

    public Double getActiveCalories() {
        return activeCalories;
    }

    public void setActiveCalories(Double activeCalories) {
        this.activeCalories = activeCalories;
    }

    public Double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(Double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public Double getBasalMetabolicRate() {
        return basalMetabolicRate;
    }

    public void setBasalMetabolicRate(Double basalMetabolicRate) {
        this.basalMetabolicRate = basalMetabolicRate;
    }

    public Integer getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(Integer averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
    }

    public Integer getAverageRestingHeartRate() {
        return averageRestingHeartRate;
    }

    public void setAverageRestingHeartRate(Integer averageRestingHeartRate) {
        this.averageRestingHeartRate = averageRestingHeartRate;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}