package com.patterns.SimpleFactory.mysimplefactory;

public class CarFactory {

    public static Car getCar(String carType) throws Exception{
        Class car = Class.forName(carType);
        return (Car) car.newInstance();
    }
}
