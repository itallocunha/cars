package com.trabalho.cars.model.repository;

import com.trabalho.cars.model.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car,String> {

}
