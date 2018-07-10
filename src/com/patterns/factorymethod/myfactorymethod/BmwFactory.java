package com.patterns.factorymethod.myfactorymethod;

public class BmwFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
