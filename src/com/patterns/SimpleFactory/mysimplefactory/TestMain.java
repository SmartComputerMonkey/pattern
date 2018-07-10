package com.patterns.SimpleFactory.mysimplefactory;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Car benz = CarFactory.getCar("com.patterns.SimpleFactory.mysimplefactory.BenzCar");
        Car bmw = CarFactory.getCar("com.patterns.SimpleFactory.mysimplefactory.BmwCar");
        benz.WhatCat();
        bmw.WhatCat();
    }
}
