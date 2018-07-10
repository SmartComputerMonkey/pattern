package com.patterns.factorymethod.myfactorymethod;

public class TestMain {
    public static void main(String[] args) throws Exception {
        CarFactory benz = new BenzCarFactory();
        Car benzCar = benz.getCar();
        benzCar.WhatCat();

        CarFactory bmw = new BmwFactory();
        Car bmwCar = bmw.getCar();
        bmwCar.WhatCat();

        CarFactory audi = new AudiFactory();
        Car audiCar = audi.getCar();
        audiCar.WhatCat();
    }
}
