package com.patterns.factorymethod;

public class PearFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Pear();
	}
}
