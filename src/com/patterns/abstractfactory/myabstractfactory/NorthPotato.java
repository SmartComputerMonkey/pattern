package com.patterns.abstractfactory.myabstractfactory;

public class NorthPotato implements Vegetable {
    @Override
    public void getVegetable() {
        System.out.println("采集北方土豆！");
    }
}
