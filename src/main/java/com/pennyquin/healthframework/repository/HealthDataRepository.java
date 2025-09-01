package com.pennyquin.healthframework.repository;

import com.pennyquin.healthframework.entity.DailyReportData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface HealthDataRepository extends MongoRepository<DailyReportData, String> {

    Optional<DailyReportData> findByUserIdAndDate(String userId, String date);

    boolean existsByUserIdAndDate(String userId, LocalDate date);
}