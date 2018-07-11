package com.patterns.abstractfactory.myabstractfactory;

public class SouthVegetableFactory implements VegetableFactory {
    @Override
    public Vegetable getPotato() {
        return new SourhPotato();
    }

    @Override
    public Vegetable getCabbage() {
        return new SouthCabbage();
    }
}
