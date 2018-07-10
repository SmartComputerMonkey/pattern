package com.designpatterns.prototypepattern.attention;

public class Thing implements Cloneable {

	public Thing() {
		System.out.println("构造函数被执行了...");
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
