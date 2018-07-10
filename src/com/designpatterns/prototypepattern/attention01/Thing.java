package com.designpatterns.prototypepattern.attention01;

import java.util.ArrayList;

public class Thing implements Cloneable {

	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
			//深拷贝
			thing.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thing;
	}

	// 设置HashMap的值
	public void setValue(String value) {
		this.arrayList.add(value);
	}

	// 取得arrayList的值
	public ArrayList<String> getValue() {
		return this.arrayList;
	}
}
