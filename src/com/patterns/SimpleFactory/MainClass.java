package com.patterns.SimpleFactory;

public class MainClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		//实例化一个Apple
//		Apple apple = new Apple();
//		//实例化一个Banana
//		Banana banana = new Banana();
//		
//		apple.get();
//		banana.get();
		
//		//实例化一个Apple,用到了多态
//		Fruit apple = new Apple();
//		Fruit banana = new Banana();
//		apple.get();
//		banana.get();
		
//		//实例化一个Apple
//		Fruit apple = FruitFactory.getApple();
//		Fruit banana = FruitFactory.getBanana();
//		apple.get();
//		banana.get();
		
		Fruit apple = FruitFactory.getFruit("com.patterns.SimpleFactory.Apple");
		Fruit banana = FruitFactory.getFruit("com.patterns.SimpleFactory.Banana");
		apple.get();
		banana.get();
		
	}
}
