package com.designpatterns.compositepattern.pattern02;

import java.util.ArrayList;

public class Branch implements IBranch,IGorp {

	//存储子节点的信息
	private ArrayList<IGorp> subordinateList = new ArrayList<IGorp>();
	//树枝节点的名称
	private String name="";
	//树枝节点的职位
	private String position = "";
	//树枝节点的薪水
	private int salary = 0;
	
	//通过构造函数传递树枝节点的参数
	public Branch(String name,String position,int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info + "\t职位："+ this.position;
		info = info + "\t薪水："+this.salary;
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
