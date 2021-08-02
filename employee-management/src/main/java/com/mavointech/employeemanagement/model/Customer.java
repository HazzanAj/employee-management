package com.mavointech.employeemanagement.model;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
@Component("customerBean")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String customerCode;


    /**** Constructors Implemented Unloaded and Loaded****/
    public Customer(){};
    public Customer( String name, String email, String jobTitle, String phone, String imageUrl, String customerCode){
    this.name = name;
    this.email = email;
    this.jobTitle = jobTitle;
    this.phone = phone;
    this.imageUrl = imageUrl;
    this.customerCode = customerCode;
    }
    /*** Implemented To String ***/

};