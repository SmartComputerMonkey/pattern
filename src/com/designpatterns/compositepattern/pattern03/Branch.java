package com.designpatterns.compositepattern.pattern03;

import java.util.ArrayList;

public class Branch extends Corp {

	//领导下边有那些下级领导和小兵
	ArrayList<Corp> subordinateList = new ArrayList<Corp>();
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}
	
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}
	
	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}
}
