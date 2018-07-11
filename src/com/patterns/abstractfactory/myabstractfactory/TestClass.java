package com.patterns.abstractfactory.myabstractfactory;

public class TestClass {
    public static void main(String[] args) {
        VegetableFactory south = new SouthVegetableFactory();
        Vegetable cabbage = south.getCabbage();
        Vegetable potato = south.getPotato();
        cabbage.getVegetable();
        potato.getVegetable();
    }
}
