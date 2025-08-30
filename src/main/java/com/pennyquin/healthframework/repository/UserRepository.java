package com.pennyquin.healthframework.repository;

import com.pennyquin.healthframework.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByDeviceId(String deviceId);

    boolean existsByDeviceId(String deviceId);
}