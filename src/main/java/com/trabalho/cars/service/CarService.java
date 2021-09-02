package com.trabalho.cars.service;

import com.trabalho.cars.model.entities.Car;
import com.trabalho.cars.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void saveCar(Car carro) {
        carRepository.save(carro);
    }

    public List<Car> findAllCars(){
        List<Car>cars = carRepository.findCarList();
        return cars;
    }




}
