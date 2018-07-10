package com.designpatterns.chainofresponsibilitypattern.pattern01;

import com.designpatterns.chainofresponsibilitypattern.IWomen;

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
		
		switch(this.type){
		case 1:
			this.request = "Ů���������ǣ�" + _request;
			break;
		case 2:
			this.request = "���ӵ������ǣ�" + _request;
			break;
		case 3:
			this.request = "ĸ�׵������ǣ�" + _request;
			break;
		}
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
