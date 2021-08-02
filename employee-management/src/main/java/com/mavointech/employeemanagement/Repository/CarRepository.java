package com.mavointech.employeemanagement.Repository;

import com.mavointech.employeemanagement.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {
    void deleteCarById(Long id);

    Optional<Car> findCarById(Long id);
}