package com.designpatterns.observerpattern.pattern02;

public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("��˹���۲쵽�����ӻ���Լ�Ҳ��ʼ���...");
		this.cry(context);
		System.out.println("��˹������Ŀ�����...\n");
	}
	
	// һ����˹�л���Ϳޣ�ʹ��
	private void cry(String context) {
		System.out.println("��˹����Ϊ" + context + "�����������ұ���ѽ��");
	}
}
