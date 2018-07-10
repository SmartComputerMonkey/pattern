package com.designpatterns.factorymethodpattern;

public class NvWa {
	
	public static void main(String[] args) {
		System.out.println("--------����ĵ�һ������������:����-----------");
		Human whiteHuman = HumanFactory.createHuman(WhitHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();
		
		System.out.println("\n\n--------����ĵڶ������������ģ�����----------");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		
		System.out.println("\n\n--------����ĵ��������������ģ���ɫ����---------");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.talk();
		yellowHuman.laugh();
		yellowHuman.talk();
		
		for (int i = 0; i < 100000; i++) {
			System.out.println("\n\n------------�������������-----------------" + i);
			Human human = HumanFactory.createHuman();
			human.cry();
			human.laugh();
			human.talk();
		}
	}
}
