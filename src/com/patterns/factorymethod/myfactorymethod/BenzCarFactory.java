package com.patterns.factorymethod.myfactorymethod;

public class BenzCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
