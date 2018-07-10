package com.designpatterns.compositepattern.pattern02;

public class Leaf implements IGorp {

	//Ҷ�ӽ�ʲô����
	private String name = "";
	//Ҷ�ӵ�ְλ
	private String position = "";
	//Ҷ�ӵ�нˮ
	private int salary=0;
	
	//ͨ�����캯��������Ϣ
	public Leaf(String name,String position,int salary){
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

}
