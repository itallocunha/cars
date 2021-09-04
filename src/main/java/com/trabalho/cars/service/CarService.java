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


    public List<Car> findAllCarsByBrand(String brand) {

        List<Car>cars = carRepository.findAllCarsByBrand(brand);

        return cars;
    }

    public List<Car> findAllCarsByName(String name) {

        List<Car>cars = carRepository.findAllCarsByName(name);
        return cars;
    }

    public List<Car> findAllCarsByColor(String Color) {

        List<Car>cars = carRepository.findAllCarsByColor(Color);

        return cars;
    }

    public List<Car> findAllCarsOrderByLetter() {
        List<Car>cars = carRepository.findAllCarsOrderByLetter();

        return cars;
    }


    public List<Car> findAllCarsOrderByValue() {
        List<Car>cars = carRepository.findAllCarsOrderByValue();

        return cars;
    }

    public void deleteAllCars() {
        carRepository.deleteAll();
    }

    public Car createNewCar(Car carForm) {
        Car newCar = new Car(carForm);

        carRepository.save(newCar);
        return newCar;
    }


    public List<Car> findAllCarsOrderByAgefab() {
        List<Car>cars = carRepository.findAllCarsOrderByAgefab();

        return cars;

    }
}
