package com.designpatterns.bridgepattern.implementor;

public class Clothes extends Product {

	@Override
	public void beProducted() {
		System.out.println("���������·���������ӵ�...");
	}

	@Override
	public void beSelled() {
		System.out.println("���������·�����ȥ��...");
	}

}