package com.trabalho.cars.controller;

import com.trabalho.cars.model.entities.Car;
import com.trabalho.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/cars")
public class mainController {

    @Autowired
    private CarService carService;


    @GetMapping("/")
    public ResponseEntity <List<Car>> listAllCars(){
        List<Car> listCars = carService.findAllCars();
        return ResponseEntity.ok().body(listCars);
    }




}
