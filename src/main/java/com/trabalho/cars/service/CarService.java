package com.trabalho.cars.service;

import com.trabalho.cars.model.entities.Car;
import com.trabalho.cars.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public Optional<Car> findCarByChassi(String id) {

        Optional<Car> car = carRepository.findById(id);
        return car;
    }

    public void saveCar(Car carro) {
        carRepository.save(carro);
    }

    public Optional<List<Car>> findAllCars(){
        Optional<List<Car>> cars = Optional.of(carRepository.findAll());
        return cars;
    }

}
