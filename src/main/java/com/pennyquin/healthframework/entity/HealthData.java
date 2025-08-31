package com.pennyquin.healthframework.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "health_data")
@CompoundIndex(name = "user_date_idx", def = "{'userId': 1, 'date': 1}", unique = true)
public class HealthData {

    @Id
    private String id;

    private String userId;

    private Integer totalSteps;

    private Integer totalActiveMinutes;

    private Double totalCaloriesBurned;

    private LocalDate date;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public HealthData() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}