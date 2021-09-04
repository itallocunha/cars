package com.trabalho.cars.model.repository;

import com.trabalho.cars.model.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository <Car,String> {

    @Query("SELECT obj FROM car obj WHERE obj.chassi != null")
    List<Car> findCarList();

    @Query("SELECT obj FROM car obj WHERE obj.brand = :receivbrand")
    List<Car> findAllCarsByBrand(@Param("receivbrand")String receivbrand);

    @Query("SELECT obj FROM car obj WHERE obj.name = :receivname")
    List<Car> findAllCarsByName(@Param("receivname")String name);

    @Query ("SELECT obj FROM car obj WHERE obj.color = :receivcolor")
    List<Car> findAllCarsByColor(@Param("receivcolor")String color);

    @Query ("SELECT obj FROM car obj ORDER BY obj.name")
    List<Car> findAllCarsOrderByLetter();

    @Query ("SELECT obj FROM car obj ORDER BY obj.value")
    List<Car> findAllCarsOrderByValue();

    @Query ("SELECT obj FROM car obj ORDER BY obj.ageFab")
    List<Car> findAllCarsOrderByAgefab();
}
