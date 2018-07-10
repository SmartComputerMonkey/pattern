package com.designpatterns.bridgepattern;

public class IPodCorp extends Corp {

	@Override
	protected void produce() {
		System.out.println("������iPod...");
	}

	@Override
	protected void sell() {
		System.out.println("iPod����...");
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}
}
