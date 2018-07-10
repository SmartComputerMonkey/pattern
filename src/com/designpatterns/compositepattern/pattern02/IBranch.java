package com.designpatterns.compositepattern.pattern02;

import java.util.ArrayList;

public interface IBranch {
	
	//增加数据节点，例如研发部下的研发一组
	public void add(IGorp gorp);
	//获得下级信息
	public ArrayList<IGorp> getSubordinateInfo();
}
