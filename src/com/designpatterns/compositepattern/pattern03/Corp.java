package com.designpatterns.compositepattern.pattern03;

public abstract class Corp {
	
	// ��֦�ڵ������
	private String name = "";
	// ��֦�ڵ��ְλ
	private String position = "";
	// ��֦�ڵ��нˮ
	private int salary = 0;

	// ͨ�����캯��������֦�ڵ�Ĳ���
	public Corp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}
}
