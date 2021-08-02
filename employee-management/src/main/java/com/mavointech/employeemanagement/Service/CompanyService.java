package com.mavointech.employeemanagement.Service;

import com.mavointech.employeemanagement.Exception.CompanyNotFoundException;
import com.mavointech.employeemanagement.Repository.CompanyRepository;
import com.mavointech.employeemanagement.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class CompanyService {

    private final CompanyRepository companyRepository; // Performed CompanyRepository Data Injection

    @Autowired
    public CompanyService(CompanyRepository companyRepository) { // Added Constructor and parameter
        this.companyRepository = companyRepository;
    }


    /*** Setting a random code value to the company ***/
    public Company addCompany(Company company){
        company.setCompanyCode(UUID.randomUUID().toString());
        return companyRepository.save(company);
    }

    /*** Getting list of the company ***/
    public List<Company> findAllCompany(){
        return companyRepository.findAll();
    }


    /*** Updating company ***/
    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }

    /*** Getting list of the company by Id  ***/
    public Company findCompanyById(Long id){
        return companyRepository.findCompanyById(id)
                .orElseThrow(() -> new CompanyNotFoundException("Company By Id" + id + "Was Not Found"));
    }

    /*** Deleting Company ***/
    public void deleteCompany( Long id){
        companyRepository.deleteCompanyById(id);
    }






}
