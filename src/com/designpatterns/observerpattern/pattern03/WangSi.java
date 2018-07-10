package com.designpatterns.observerpattern.pattern03;

import java.util.Observable;
import java.util.Observer;

public class WangSi implements Observer {

	// һ����˹�л���Ϳޣ�ʹ��
	private void cry(String context) {
		System.out.println("��˹����Ϊ" + context + "�����������ұ���ѽ��");
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��˹���۲쵽�����ӻ���Լ�Ҳ��ʼ���...");
		this.cry(arg.toString());
		System.out.println("��˹������Ŀ�����...\n");
	}
}
