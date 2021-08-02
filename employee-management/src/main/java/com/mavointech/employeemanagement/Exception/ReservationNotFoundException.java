package com.mavointech.employeemanagement.Exception;

public class ReservationNotFoundException  extends RuntimeException {
    public ReservationNotFoundException(String message) {
        super(message);
    }
}