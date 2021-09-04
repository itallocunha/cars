package com.trabalho.cars.controller;

import com.trabalho.cars.model.entities.Car;
import com.trabalho.cars.service.CarService;
import com.trabalho.cars.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.util.List;



@RestController
@RequestMapping("/api/cars")
public class mainController {

    @Autowired
    private CarService carService;

    @Autowired
    private DBService dbService;

    @PostMapping("/")
    public ResponseEntity <Car> postNewCar(@RequestBody Car carForm) throws ParseException {
        carService.saveCar(carForm);
        return ResponseEntity.ok().body(carForm);
    }

    @GetMapping("/")
    public ResponseEntity <List<Car>> listAllCars() throws ParseException {
        dbService.instanciaBaseDados();
        List<Car> listCars = carService.findAllCars();
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/brand/{brand}")
    public ResponseEntity <List<Car>> listAllCarsByBrand(@PathVariable String brand) throws ParseException {
        List<Car> listCars = carService.findAllCarsByBrand(brand);
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity <List<Car>> listAllCarsByName(@PathVariable String name) throws ParseException {
        List<Car> listCars = carService.findAllCarsByName(name);
        return ResponseEntity.ok().body(listCars);
    }
    @GetMapping("/color/{color}")
    public ResponseEntity <List<Car>> listAllCarsByColor(@PathVariable String color) throws ParseException {
        List<Car> listCars = carService.findAllCarsByColor(color);
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/orderbyname")
    public ResponseEntity <List<Car>> findAllCarsOrderByLetter() throws ParseException {
        List<Car> listCars = carService.findAllCarsOrderByLetter();
        return ResponseEntity.ok().body(listCars);
    }
    @GetMapping("/orderbyvalue")
    public ResponseEntity <List<Car>> findAllCarsOrderByValue() throws ParseException {
        List<Car> listCars = carService.findAllCarsOrderByValue();
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/orderbyyearfab")
    public ResponseEntity <List<Car>> findAllCarsOrderByAgefab() throws ParseException {
        List<Car> listCars = carService.findAllCarsOrderByAgefab();
        return ResponseEntity.ok().body(listCars);
    }


    @DeleteMapping("/")
    public ResponseEntity <List<Car>> deleteAllCars() throws ParseException {
        carService.deleteAllCars();
        List<Car> listCars = carService.findAllCars();
        return ResponseEntity.ok().body(listCars);
    }


}
