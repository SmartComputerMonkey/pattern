package com.designpatterns.factorymethodpattern;

public class NvWa {
	
	public static void main(String[] args) {
		System.out.println("--------造出的第一批人是这样的:白人-----------");
		Human whiteHuman = HumanFactory.createHuman(WhitHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();
		
		System.out.println("\n\n--------造出的第二批人是这样的：黑人----------");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		
		System.out.println("\n\n--------造出的第三批人是这样的：黄色人种---------");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.talk();
		yellowHuman.laugh();
		yellowHuman.talk();
		
		for (int i = 0; i < 100000; i++) {
			System.out.println("\n\n------------随机产生人种了-----------------" + i);
			Human human = HumanFactory.createHuman();
			human.cry();
			human.laugh();
			human.talk();
		}
	}
}
