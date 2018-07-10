package com.designpatterns.bridgepattern.implementor;

public class House extends Product {

	@Override
	public void beProducted() {
		System.out.println("�������ķ�����������ӵ�...");
	}

	@Override
	public void beSelled() {
		System.out.println("�������ķ�������ȥ��...");
	}

}
