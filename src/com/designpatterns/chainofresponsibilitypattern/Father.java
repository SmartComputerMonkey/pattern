package com.designpatterns.chainofresponsibilitypattern;

public class Father implements IHandler {

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("Ů������ʾ�ǣ�"+women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��");
	}

}
