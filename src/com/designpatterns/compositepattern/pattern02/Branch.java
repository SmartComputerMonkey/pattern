package com.designpatterns.compositepattern.pattern02;

import java.util.ArrayList;

public class Branch implements IBranch,IGorp {

	//�洢�ӽڵ����Ϣ
	private ArrayList<IGorp> subordinateList = new ArrayList<IGorp>();
	//��֦�ڵ������
	private String name="";
	//��֦�ڵ��ְλ
	private String position = "";
	//��֦�ڵ��нˮ
	private int salary = 0;
	
	//ͨ�����캯��������֦�ڵ�Ĳ���
	public Branch(String name,String position,int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��"+ this.position;
		info = info + "\tнˮ��"+this.salary;
		return info;
	}


	@Override
	public ArrayList<IGorp> getSubordinateInfo() {
		return this.subordinateList;
	}

	@Override
	public void add(IGorp gorp) {
		this.subordinateList.add(gorp);
	}

}
