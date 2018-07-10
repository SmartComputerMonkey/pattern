package com.designpatterns.compositepattern;

import java.util.ArrayList;

public interface IBranch {
	
	//�����Ϣ
	public String getInfo();
	//�������ݽڵ㣬�����з����µ��з�һ��
	public void add(IBranch branch);
	//����Ҷ�ӽڵ�
	public void add(ILeaf leaf);
	//����¼���Ϣ
	public ArrayList getSubordinateInfo();
}
