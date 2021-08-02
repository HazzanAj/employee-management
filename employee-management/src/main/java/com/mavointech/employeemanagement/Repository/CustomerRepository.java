package com.mavointech.employeemanagement.Repository;

import com.mavointech.employeemanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
        void deleteCustomerById(Long id);

        Optional<Customer> findCustomerById(Long id);
        }
