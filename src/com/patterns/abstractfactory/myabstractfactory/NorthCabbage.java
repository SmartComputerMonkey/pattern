package com.patterns.abstractfactory.myabstractfactory;

public class NorthCabbage implements Vegetable {
    @Override
    public void getVegetable() {
        System.out.println("采集北方白菜！");
    }
}
