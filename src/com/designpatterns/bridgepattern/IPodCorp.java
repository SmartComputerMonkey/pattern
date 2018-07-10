package com.designpatterns.bridgepattern;

public class IPodCorp extends Corp {

	@Override
	protected void produce() {
		System.out.println("我生产iPod...");
	}

	@Override
	protected void sell() {
		System.out.println("iPod畅销...");
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}
}
