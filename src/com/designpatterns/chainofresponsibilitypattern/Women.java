package com.designpatterns.chainofresponsibilitypattern;

public class Women implements IWomen {
	
	/*
	* ͨ��һ��int���͵Ĳ�����������Ů�ĸ���״��
	* 1---δ����
	* 2---����
	* 3---����
	*/
	private int type = 0;
	
	//��Ů����ʾ
	private String request = "";
	
	public Women (int _type,String _request) {
		this.type = _type;
		this.request = _request;
	}
	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getRequest() {
		return this.request;
	}

}
