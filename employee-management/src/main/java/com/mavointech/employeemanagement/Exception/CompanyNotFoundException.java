package com.mavointech.employeemanagement.Exception;

public class CompanyNotFoundException  extends RuntimeException {
    public CompanyNotFoundException(String message) {
        super(message);
    }
}
