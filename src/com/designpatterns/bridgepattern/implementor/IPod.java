package com.designpatterns.bridgepattern.implementor;

public class IPod extends Product {

	@Override
	public void beProducted() {
		System.out.println("��������iPod��������ӵ�...");
	}

	@Override
	public void beSelled() {
		System.out.println("��������iPod����ȥ��...");
	}

}
