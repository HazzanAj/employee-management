package com.mavointech.employeemanagement.model;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
@Component("companyBean")
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String branch;
    private String location;
    private String phone;
    private String establishedDate;
    private String numberOfEmployees;
    private String numberOfCars;
    private String companyCode;

    /**** Constructors Implemented Unloaded and Loaded****/
    public Company(){};
    public Company( String name, String branch, String location, String phone, String establishedDate,
                    String numberOfEmployees, String numberOfCars, String companyCode){
        this.name = name;
        this.branch = branch;
        this.location = location;
        this.phone = phone;
        this.establishedDate = numberOfEmployees;
        this.numberOfCars = numberOfCars;
        this.companyCode = companyCode;
    };

    /*** Implemented To String ***/

}
