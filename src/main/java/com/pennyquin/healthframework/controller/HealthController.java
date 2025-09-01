package com.pennyquin.healthframework.controller;

import com.pennyquin.healthframework.dto.DailyReportDTO;
import com.pennyquin.healthframework.service.HealthDataService;
import com.pennyquin.openapi.api.HealthApi;
import com.pennyquin.openapi.model.DailyReportRequest;
import com.pennyquin.openapi.model.SuccessResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneOffset;
import java.util.TimeZone;

@RestController
public class HealthController implements HealthApi {

    private static final Logger log = LoggerFactory.getLogger(HealthController.class);
    
    @Autowired
    private HealthDataService healthDataService;

    @Override
    public ResponseEntity<SuccessResponse> healthDataDailyPost(DailyReportRequest dailyReportRequest) {
        try {
            if (dailyReportRequest == null) {
                return ResponseEntity.badRequest().build();
            }

            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication == null || !authentication.isAuthenticated()) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }

            String userId = authentication.getPrincipal().toString();

            DailyReportDTO dailyReportDTO = new DailyReportDTO(
                    userId,
                    dailyReportRequest.getDate(),
                    dailyReportRequest.getSteps(),
                    dailyReportRequest.getStand(),
                    dailyReportRequest.getDistance(),
                    dailyReportRequest.getActiveMinutes(),
                    dailyReportRequest.getActiveCalories(),
                    dailyReportRequest.getTotalCalories(),
                    dailyReportRequest.getBasalMetabolicRate(),
                    dailyReportRequest.getAverageHeartRate(),
                    dailyReportRequest.getAverageRestingHeartRate(),
                    dailyReportRequest.getTimeZone());

            healthDataService.saveHealthData(dailyReportDTO);

            SuccessResponse response = new SuccessResponse();
            response.setMessage("Health data submitted successfully");

            return ResponseEntity.ok(response);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}