package com.trabalho.cars;

import com.trabalho.cars.model.entities.Car;
import com.trabalho.cars.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCarrosApplication {

	@Autowired
	CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiCarrosApplication.class, args);
	}

}
