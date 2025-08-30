package com.pennyquin.healthframework.repository;

import com.pennyquin.healthframework.entity.HealthData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface HealthDataRepository extends MongoRepository<HealthData, String> {

    Optional<HealthData> findByUserIdAndDate(String userId, LocalDate date);

    boolean existsByUserIdAndDate(String userId, LocalDate date);
}