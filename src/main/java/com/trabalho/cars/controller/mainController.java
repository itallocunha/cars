package com.trabalho.cars.controller;

import com.trabalho.cars.model.entities.Car;
import com.trabalho.cars.service.CarService;
import com.trabalho.cars.service.DBService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.util.List;



@RestController
@RequestMapping("/api/cars")
@Api(value= "API REST cars")
@CrossOrigin(origins="*")
public class mainController {

    @Autowired
    private CarService carService;

    @Autowired
    private DBService dbService;

    @PostMapping("/")
    @ApiOperation(value="Salva um carro")
    public ResponseEntity <Car> postNewCar(@RequestBody Car carForm) throws ParseException {
        carService.saveCar(carForm);
        return ResponseEntity.ok().body(carForm);
    }

    @GetMapping("/")
    @ApiOperation(value="Retorna uma lista de carro")
    public ResponseEntity <List<Car>> listAllCars() throws ParseException {
        dbService.instanciaBaseDados();
        List<Car> listCars = carService.findAllCars();
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/brand/{brand}")
    @ApiOperation(value="Retorna uma lista de marca")
    public ResponseEntity <List<Car>> listAllCarsByBrand(@PathVariable String brand) throws ParseException {
        List<Car> listCars = carService.findAllCarsByBrand(brand);
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/name/{name}")
    @ApiOperation(value="Retorna uma lista de nome")
    public ResponseEntity <List<Car>> listAllCarsByName(@PathVariable String name) throws ParseException {
        List<Car> listCars = carService.findAllCarsByName(name);
        return ResponseEntity.ok().body(listCars);
    }
    @GetMapping("/color/{color}")
    @ApiOperation(value="Retorna uma lista de cor")
    public ResponseEntity <List<Car>> listAllCarsByColor(@PathVariable String color) throws ParseException {
        List<Car> listCars = carService.findAllCarsByColor(color);
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/orderbyname")
    @ApiOperation(value="Retorna uma ordenacao de nome")
    public ResponseEntity <List<Car>> findAllCarsOrderByLetter() throws ParseException {
        List<Car> listCars = carService.findAllCarsOrderByLetter();
        return ResponseEntity.ok().body(listCars);
    }
    @GetMapping("/orderbyvalue")
    @ApiOperation(value="Retorna uma ordenacao de valor")
    public ResponseEntity <List<Car>> findAllCarsOrderByValue() throws ParseException {
        List<Car> listCars = carService.findAllCarsOrderByValue();
        return ResponseEntity.ok().body(listCars);
    }

    @GetMapping("/orderbyyearfab")
    @ApiOperation(value="Retorna uma ordenacao de ano de fabricacao")
    public ResponseEntity <List<Car>> findAllCarsOrderByAgefab() throws ParseException {
        List<Car> listCars = carService.findAllCarsOrderByAgefab();
        return ResponseEntity.ok().body(listCars);
    }


    @DeleteMapping("/")
    @ApiOperation(value="Deleta tudo")
    public ResponseEntity <List<Car>> deleteAllCars() throws ParseException {
        carService.deleteAllCars();
        List<Car> listCars = carService.findAllCars();
        return ResponseEntity.ok().body(listCars);
    }


}
