package com.patterns.factorymethod;

public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Banana();
	}

}
