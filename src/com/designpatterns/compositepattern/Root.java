package com.designpatterns.compositepattern;

import java.util.ArrayList;

public class Root implements IRoot {
	
	//������ڵ��µ���֦�ڵ����Ҷ�ڵ㣬Subordinate����˼���¼�
	private ArrayList subordinateList = new ArrayList();
	
	//���ڵ������
	private String name = "";
	//���ڵ��ְλ
	private String position = "";
	//���ڵ��нˮ
	private int salary = 0;
	
	public Root(String name,String position,int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String getInfo() {

		String info = "";
		info = "���ƣ� " + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}

	@Override
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}

	@Override
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}

	@Override
	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}

}
