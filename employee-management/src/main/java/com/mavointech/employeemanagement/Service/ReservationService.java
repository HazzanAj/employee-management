package com.mavointech.employeemanagement.Service;

import com.mavointech.employeemanagement.Exception.EmployeeNotFoundException;
import com.mavointech.employeemanagement.Exception.ReservationNotFoundException;
import com.mavointech.employeemanagement.Repository.EmployeeRepository;
import com.mavointech.employeemanagement.Repository.ReservationRepository;
import com.mavointech.employeemanagement.model.Employee;
import com.mavointech.employeemanagement.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ReservationService {


    private final ReservationRepository reservationRepository; // Performed ReservationRepository Data Injection

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) { // Added Constructor and parameter
        this.reservationRepository = reservationRepository;
    }

    /*** Setting a random code value to the reservation ***/
    public Reservation addReservation(Reservation reservation){
        reservation.setReservationCode(UUID.randomUUID().toString());
        return reservationRepository.save(reservation);
    }


    /*** Getting list of the reservation ***/
    public List<Reservation> findAllReservation(){
        return reservationRepository.findAll();
    }

    /*** Updating reservation ***/
    public Reservation updateReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    /*** Getting list of the reservation by Id  ***/
    public Reservation findReservationById(Long id){
        return reservationRepository.findReservationById(id)
                .orElseThrow(() -> new ReservationNotFoundException("User By Id" + id + "Was Not Found"));
    }

    /*** Deleting reservation ***/
    public void deleteReservation( Long id){
        reservationRepository.deleteReservationById(id);
    }

}
