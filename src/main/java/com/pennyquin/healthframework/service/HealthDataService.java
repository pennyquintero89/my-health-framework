package com.pennyquin.healthframework.service;

import com.pennyquin.healthframework.dto.DailyReportDTO;
import com.pennyquin.healthframework.entity.DailyReportData;
import com.pennyquin.healthframework.repository.HealthDataRepository;
import com.pennyquin.healthframework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HealthDataService {

    @Autowired
    private HealthDataRepository healthDataRepository;

    @Autowired
    private UserRepository userRepository;

    public void saveHealthData(DailyReportDTO dailyReportDTO) {
        validateHealthData(dailyReportDTO);

        if (!userRepository.existsById(dailyReportDTO.getUserId())) {
            throw new IllegalArgumentException("User not found");
        }

        DailyReportData healthData = healthDataRepository
                .findByUserIdAndDate(dailyReportDTO.getUserId(), dailyReportDTO.getDate().toString())
                .orElseGet(DailyReportData::new);

        healthData.setDate(dailyReportDTO.getDate());
        healthData.setUserId(dailyReportDTO.getUserId());
        healthData.setSteps(dailyReportDTO.getSteps());
        healthData.setStand(dailyReportDTO.getStand());
        healthData.setDistance(dailyReportDTO.getDistance());
        healthData.setActiveMinutes(dailyReportDTO.getActiveMinutes());
        healthData.setActiveCalories(dailyReportDTO.getActiveCalories());
        healthData.setTotalCalories(dailyReportDTO.getTotalCalories());
        healthData.setBasalMetabolicRate(dailyReportDTO.getBasalMetabolicRate());
        healthData.setAverageHeartRate(dailyReportDTO.getAverageHeartRate());
        healthData.setAverageRestingHeartRate(dailyReportDTO.getAverageRestingHeartRate());
        healthData.setTimeZone(dailyReportDTO.getTimeZone());
        healthData.setUpdatedAt(LocalDateTime.now());

        healthDataRepository.save(healthData);
    }

    private void validateHealthData(DailyReportDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("Daily report cannot be null");
        }
        if (dto.getUserId() == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }
        if (dto.getDate() == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }

        checkNonNegative(dto.getSteps(), "Steps");
        checkNonNegative(dto.getActiveMinutes(), "Active minutes");
        checkNonNegative(dto.getTotalCalories(), "Total calories");
        checkNonNegative(dto.getActiveCalories(), "Active calories");
        checkNonNegative(dto.getBasalMetabolicRate(), "Basal metabolic rate");
        checkNonNegative(dto.getAverageHeartRate(), "Average heart rate");
        checkNonNegative(dto.getAverageRestingHeartRate(), "Average resting heart rate");
    }

    private void checkNonNegative(Number value, String fieldName) {
        if (value.doubleValue() < 0) {
            throw new IllegalArgumentException(fieldName + " cannot be negative");
        }
    }
}