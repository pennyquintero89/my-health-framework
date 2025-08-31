package com.pennyquin.healthframework.service;

import com.pennyquin.healthframework.dto.HealthDataDTO;
import com.pennyquin.healthframework.entity.HealthData;
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

    public void saveHealthData(HealthDataDTO healthDataDTO) {
        validateHealthData(healthDataDTO);

        if (!userRepository.existsById(healthDataDTO.getUserId())) {
            throw new IllegalArgumentException("User not found");
        }

        HealthData healthData = healthDataRepository
                .findByUserIdAndDate(healthDataDTO.getUserId(), healthDataDTO.getDate())
                .orElseGet(HealthData::new);

        healthData.setUserId(healthDataDTO.getUserId());
        healthData.setTotalSteps(healthDataDTO.getTotalSteps());
        healthData.setTotalActiveMinutes(healthDataDTO.getTotalActiveMinutes());
        healthData.setTotalCaloriesBurned(healthDataDTO.getTotalCaloriesBurned());
        healthData.setDate(healthDataDTO.getDate());
        healthData.setUpdatedAt(LocalDateTime.now());

        healthDataRepository.save(healthData);
    }

    private void validateHealthData(HealthDataDTO dto) {
        if (dto.getTotalSteps() < 0) {
            throw new IllegalArgumentException("Total steps cannot be negative");
        }
        if (dto.getTotalActiveMinutes() < 0) {
            throw new IllegalArgumentException("Total active minutes cannot be negative");
        }
        if (dto.getTotalCaloriesBurned() < 0) {
            throw new IllegalArgumentException("Total calories burned cannot be negative");
        }
        if (dto.getDate() == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
    }
}