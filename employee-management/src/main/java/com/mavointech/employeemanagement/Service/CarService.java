package com.mavointech.employeemanagement.Service;

import com.mavointech.employeemanagement.Exception.CarNotFoundException;
import com.mavointech.employeemanagement.Exception.CompanyNotFoundException;
import com.mavointech.employeemanagement.Repository.CarRepository;
import com.mavointech.employeemanagement.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class CarService {

    private final CarRepository carRepository; // Performed CarRepository Data Injection

    @Autowired
    public CarService(CarRepository carRepository) { // Added Constructor and parameter
        this.carRepository = carRepository;
    }


    /*** Setting a random code value to the car ***/
    public Car addCar(Car car){
        car.setCarCode(UUID.randomUUID().toString());
        return carRepository.save(car);
    }

    /*** Getting list of the car ***/
    public List<Car> findAllCars(){
        return carRepository.findAll();
    }


    /*** Updating car ***/
    public Car updateCar(Car car){
        return carRepository.save(car);
    }

    /*** Getting list of the car by Id  ***/
    public Car findCarById(Long id){
        return carRepository.findCarById(id)
                .orElseThrow(() -> new CarNotFoundException("Car By Id" + id + "Was Not Found"));
    }

    /*** Deleting Car ***/
    public void deleteCar( Long id){
        carRepository.deleteCarById(id);
    }


}
