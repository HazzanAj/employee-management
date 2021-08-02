package com.mavointech.employeemanagement.model;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
@Component("reservationBean")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String customerName;
    private String carName;
    private String carHiringDuration;
    private String price;
    private String pickUpTime;
    private String returnTime;
    private String reservationCode;

    /**** Constructors Implemented Unloaded and Loaded****/
    public Reservation(){};
    public Reservation( String customerName, String carName, String carHiringDuration, String price, String pickUpTime,
                        String returnTime, String reservationCode){
        this.customerName  = customerName;
        this.carName = carName;
        this.carHiringDuration = carHiringDuration;
        this.price = price;
        this.pickUpTime = pickUpTime;
        this.returnTime = returnTime;
        this.reservationCode = reservationCode;
    };

    /*** Implemented To String ***/
}
