package com.designpatterns.chainofresponsibilitypattern;

public class Son implements IHandler {

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("ĸ�׵���ʾ�ǣ�"+women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��");
	}

}
