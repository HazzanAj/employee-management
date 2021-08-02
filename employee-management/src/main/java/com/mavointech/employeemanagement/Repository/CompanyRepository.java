package com.mavointech.employeemanagement.Repository;

import com.mavointech.employeemanagement.model.Company;
import com.mavointech.employeemanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    void deleteCompanyById(Long id);

    Optional<Company> findCompanyById(Long id);
}