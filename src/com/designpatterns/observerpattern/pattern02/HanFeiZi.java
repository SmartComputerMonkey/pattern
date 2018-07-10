package com.designpatterns.observerpattern.pattern02;

import java.util.ArrayList;

public class HanFeiZi implements Observable {

	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}
	
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		this.notifyObservers("�������ڳԷ�");
	}

	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.notifyObservers("������������");
	}

}
