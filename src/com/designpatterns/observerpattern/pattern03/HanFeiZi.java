package com.designpatterns.observerpattern.pattern03;

import java.util.Observable;

public class HanFeiZi extends Observable {

	
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		super.setChanged();
		super.notifyObservers("�������ڳԷ�");
	}

	public void haveFun() {
		System.out.println("������:��ʼ������...");
		super.setChanged();
		super.notifyObservers("������������");
	}

}
