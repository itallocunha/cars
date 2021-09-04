package com.trabalho.cars.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "car")
public class Car {

    @Id
    @Column(name = "chassi", nullable = false, length = 20)
    private String chassi;
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Column(name = "brand", nullable = false, length = 20)
    private String brand;
    @Column(name = "color", nullable = false, length = 20)
    private String color;
    @Column(name = "value", nullable = false, length = 20)
    private BigDecimal value;
    @Column(name = "agefab", nullable = false, length = 20)
    private Integer ageFab;

    public Car(){

    }

    public Car(String chassi, String name, String brand, String color, BigDecimal value, Integer ageFab){
        this.chassi = chassi;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.value = value;
        this.ageFab = ageFab;
    }

    public Car(Car carForm) {
        carForm.chassi = this.chassi;
        carForm.name = this.name;
        carForm.brand = this.brand;
        carForm.color = this.color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Integer getAgeFab() {
        return ageFab;
    }

    public void setAgeFab(Integer ageFab) {
        this.ageFab = ageFab;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
