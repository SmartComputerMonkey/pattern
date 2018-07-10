package com.designpatterns.singletonpattern;

public class SingletonPattern2 {
	
	private static final SingletonPattern2 singletonPattern = new SingletonPattern2();
	
	private SingletonPattern2() {
		
	}
	
	public synchronized static SingletonPattern2 getInstance() {
		
		return singletonPattern;
	}
}
