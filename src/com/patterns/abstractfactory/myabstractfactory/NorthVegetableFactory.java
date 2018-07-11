package com.patterns.abstractfactory.myabstractfactory;

public class NorthVegetableFactory implements VegetableFactory{
    @Override
    public Vegetable getPotato() {
        return new NorthPotato();
    }

    @Override
    public Vegetable getCabbage() {
        return new NorthCabbage();
    }
}
