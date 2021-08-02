package com.mavointech.employeemanagement.Service;

import com.mavointech.employeemanagement.Exception.CustomerNotFoundException;
import com.mavointech.employeemanagement.Repository.CustomerRepository;
import com.mavointech.employeemanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepository customerRepository; // Performed CustomerRepository Data Injection

    @Autowired
    public CustomerService(CustomerRepository customerRepository) { // Added Constructor and parameter
        this.customerRepository = customerRepository;
    }

    /*** Getting list of the employee ***/
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }


    /*** Setting a random code value to the customer ***/
    public Customer addCustomer(Customer customer){
        customer.setCustomerCode(UUID.randomUUID().toString());
        return customerRepository.save(customer);
    }

    /*** Updating customer ***/
    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    /*** Getting list of the customer by Id  ***/
    public Customer findCustomerById(Long id){
        return customerRepository.findCustomerById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer By Id" + id + "Was Not Found"));
    }


    /*** Deleting Employee ***/
    public void deleteCustomer( Long id){
        customerRepository.deleteCustomerById(id);
    }


}
