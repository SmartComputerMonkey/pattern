package com.designpatterns.bridgepattern.abstraction;

import com.designpatterns.bridgepattern.implementor.House;

public class HouseCorp extends Corp {

	public HouseCorp (House house) {
		super(house);
	}
	
	public void makeMoney() {
		
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}
}
