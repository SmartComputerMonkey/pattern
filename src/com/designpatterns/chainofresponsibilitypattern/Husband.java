package com.designpatterns.chainofresponsibilitypattern;

public class Husband implements IHandler {

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("���ӵ���ʾ�ǣ�"+women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��");
	}

}
