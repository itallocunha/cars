package com.trabalho.cars.service;

import com.trabalho.cars.model.entities.Car;
import com.trabalho.cars.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Arrays;

public class DBService {

    @Autowired
    private CarRepository carRepository;

    public void instanciaBaseDados() throws ParseException{

        Car car1 = new Car("1J2B4B5B35BJ6","Ferrari","Tigre","Vermelha", new BigDecimal(200000),2022);
        Car car2 = new Car("J54D89FB239D7","Q5","Audi","Verde", new BigDecimal(300000),2022);
        Car car3 = new Car("H6D5G9F6G78D6","RENEGADE","Jeep","Cinza", new BigDecimal(350000),2022);
        Car car4 = new Car("FD6G7F5G67F6G","MdLaren","Astron Martin","Azul", new BigDecimal(260000),2012);
        Car car5 = new Car("SDHH12314124G","SERIE 8","BMW","Roxo", new BigDecimal(200000),2013);
        Car car6 = new Car("Y4F235F4JY2Y4","ARRIZO 6","Caoa Chery","Amarelo", new BigDecimal(300000),2021);
        Car car7 = new Car("V3CGH5366JBHJ","STRADA","Fiat","Branco", new BigDecimal(600000),2021);
        Car car8 = new Car("32V4G65K6745H","IEV20","JAC","Branco", new BigDecimal(123000),2020);
        Car car9 = new Car("23JH46JH454JH","E-PACE","Jaguar","Verde", new BigDecimal(123000),2012);
        Car car10 = new Car("J346G67J56J6","AZERA","Hyundai","Azul", new BigDecimal(350000),2012);
        Car car11 = new Car("345FT64J5H64","KTM","Husqvarna","Preto", new BigDecimal(120000),2022);
        Car car12 = new Car("758F78T6YHFU","URUS","Lamborghini","Preto", new BigDecimal(400000),2022);
        Car car13 = new Car("34L536GY56YJ","RANGE ROVER SPORT","Land Rover","Verde", new BigDecimal(235000),2015);
        Car car14 = new Car("4353G4U5UIY4","X60","Lifan","Azul", new BigDecimal(344000),2022);
        Car car15 = new Car("543G53UY45YJ","RX450H","Lexus","Preto", new BigDecimal(234500),2016);
        Car car16 = new Car("53UY4G5YU345","RANGER","Ford","Branco", new BigDecimal(234000),2017);
        Car car17 = new Car("345YUJ3G45U5","TRAILBLAZER","Chevrolet","Azul", new BigDecimal(300000),2018);
        Car car18 = new Car("34YG234YU2J34","Vitara","Suzuki","Amarelo", new BigDecimal(345000),2019);
        Car car19 = new Car("G32GY423G4YH","PRIUS","Toyota","Branco", new BigDecimal(123400),2020);
        Car car20 = new Car("32YH4J23G4YY","S90","Volvo","Azul", new BigDecimal(123000),2021);
        Car car21 = new Car("234JU23J4GU2","NMAX Star","Yamaha","Verde", new BigDecimal(345000),2012);
        Car car22 = new Car("K42U34G235UUY","TX4","Troller","Amarelo", new BigDecimal(345000),2012);
        Car car23 = new Car("UY32G4JY234GY","LOGAN","Renault","Branco", new BigDecimal(450000),2012);

        carRepository.saveAll(Arrays.asList(car1,car2,car3,car4,car5,car6,car7,car8,car9,car10,car11,car12,car13,car14,car15,car16,car17,car18,car19,car20,car21,car22,car23));

    }

}
