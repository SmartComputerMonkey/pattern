package com.designpatterns.prototypepattern.attention;

public class Thing implements Cloneable {

	public Thing() {
		System.out.println("���캯����ִ����...");
	}
	
	@Override
	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thing;
	}
}
