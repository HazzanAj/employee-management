package com.mavointech.employeemanagement.Exception;

public class CarNotFoundException   extends RuntimeException {
    public CarNotFoundException(String message) {
        super(message);
    }
}