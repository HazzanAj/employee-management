package com.mavointech.employeemanagement.Repository;

import com.mavointech.employeemanagement.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    void deleteReservationById(Long id);

    Optional<Reservation> findReservationById(Long id);
}