package com.designpatterns.compositepattern.pattern03;

public abstract class Corp {
	
	// 树枝节点的名称
	private String name = "";
	// 树枝节点的职位
	private String position = "";
	// 树枝节点的薪水
	private int salary = 0;

	// 通过构造函数传递树枝节点的参数
	public Corp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info + "\t职位：" + this.position;
		info = info + "\t薪水：" + this.salary;
		return info;
	}
}
