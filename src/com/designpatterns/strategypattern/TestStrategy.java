package com.designpatterns.strategypattern;

public class TestStrategy {

	public static void main(String[] args) {
		Context context = new Context(new BackDoor());
		context.operate();
		context = new Context(new GivenGreenLight());
		context.operate();
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
