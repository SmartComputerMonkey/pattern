package com.designpatterns.chainofresponsibilitypattern.pattern01;

import com.designpatterns.chainofresponsibilitypattern.IWomen;

public class Husband extends Handler {

	public Husband(){
		super(2);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("--------�������ɷ���ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");
	}

}
