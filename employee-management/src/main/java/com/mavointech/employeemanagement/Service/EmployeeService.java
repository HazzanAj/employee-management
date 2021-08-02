package com.mavointech.employeemanagement.Service;

import com.mavointech.employeemanagement.Exception.EmployeeNotFoundException;
import com.mavointech.employeemanagement.Repository.EmployeeRepository;
import com.mavointech.employeemanagement.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository; // Performed EmployeeRepository Data Injection

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) { // Added Constructor and parameter
        this.employeeRepository = employeeRepository;
    }

    /*** Setting a random code value to the customer ***/
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }


    /*** Getting list of the employee ***/
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    /*** Updating employee ***/
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    /*** Getting list of the employee by Id  ***/
    public Employee findEmployeeById(Long id){
       return employeeRepository.findEmployeeById(id)
               .orElseThrow(() -> new EmployeeNotFoundException("User By Id" + id + "Was Not Found"));
    }

    /*** Deleting Employee ***/
    public void deleteEmployee( Long id){
        employeeRepository.deleteEmployeeById(id);
    }
}
