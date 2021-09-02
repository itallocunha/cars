package com.trabalho.cars.controller;

import com.trabalho.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/cars")
public class mainController {

    @Autowired
    private CarService carService;



}
