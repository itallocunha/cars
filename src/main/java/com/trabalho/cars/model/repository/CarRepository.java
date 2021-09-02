package com.trabalho.cars.model.repository;

import com.trabalho.cars.model.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CarRepository extends JpaRepository <Car,String> {

    @Query("SELECT obj FROM car obj WHERE obj.chassi != null")
    List<Car> findCarList();

}
