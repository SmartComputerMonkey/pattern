package com.patterns.factorymethod.myfactorymethod;

public class AudiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
