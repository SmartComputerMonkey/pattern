package com.designpatterns.compositepattern.pattern02;

import java.util.ArrayList;

public interface IBranch {
	
	//�������ݽڵ㣬�����з����µ��з�һ��
	public void add(IGorp gorp);
	//����¼���Ϣ
	public ArrayList<IGorp> getSubordinateInfo();
}
