package com.pennyquin.healthframework.dto;

import java.time.LocalDate;

public class HealthDataDTO {

    private String userId;
    private Integer totalSteps;
    private Integer totalActiveMinutes;
    private Double totalCaloriesBurned;
    private LocalDate date;

    public HealthDataDTO() {}

    public HealthDataDTO(String userId, Integer totalSteps, Integer totalActiveMinutes,
                         Double totalCaloriesBurned, LocalDate date) {
        this.userId = userId;
        this.totalSteps = totalSteps;
        this.totalActiveMinutes = totalActiveMinutes;
        this.totalCaloriesBurned = totalCaloriesBurned;
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getTotalSteps() {
        return totalSteps;
    }

    public void setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
    }

    public Integer getTotalActiveMinutes() {
        return totalActiveMinutes;
    }

    public void setTotalActiveMinutes(Integer totalActiveMinutes) {
        this.totalActiveMinutes = totalActiveMinutes;
    }

    public Double getTotalCaloriesBurned() {
        return totalCaloriesBurned;
    }

    public void setTotalCaloriesBurned(Double totalCaloriesBurned) {
        this.totalCaloriesBurned = totalCaloriesBurned;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}