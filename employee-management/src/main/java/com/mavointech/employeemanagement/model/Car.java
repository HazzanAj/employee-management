package com.mavointech.employeemanagement.model;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
@Component("carBean")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String carName;
    private String carEngine;
    private String carFuelType;
    private String carModel;
    private String carChargesPerMin;
    private String carBookingStatus;
    private String carCode;


    /**** Constructors Implemented Unloaded and Loaded****/
    public Car(){};
    public Car( String carName, String carEngine, String carFuelType, String carModel, String carChargesPerMin,
                String carBookingStatus, String carCode){
        this.carName = carName;
        this.carEngine = carEngine;
        this.carFuelType = carFuelType;
        this.carModel = carModel;
        this.carChargesPerMin = carChargesPerMin;
        this.carBookingStatus = carBookingStatus;
        this.carCode = carCode;
    };

    /*** Implemented To String ***/

}
