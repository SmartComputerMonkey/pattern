package com.designpatterns.prototypepattern.attention01;

import java.util.ArrayList;

public class Thing implements Cloneable {

	private ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
			//���
			thing.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thing;
	}

	// ����HashMap��ֵ
	public void setValue(String value) {
		this.arrayList.add(value);
	}

	// ȡ��arrayList��ֵ
	public ArrayList<String> getValue() {
		return this.arrayList;
	}
}
