package com.designpatterns.observerpattern.pattern03;

import java.util.Observable;
import java.util.Observer;

public class LiuSi implements Observer {

	
	// һ���������б仯�����Ϳ���
	private void happy(String context) {
		System.out.println("��˹����Ϊ" + context + ",���������ҿ���ѽ��");
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��˹���۲쵽�����ӻ����ʼ������...");
		this.happy(arg.toString());
		System.out.println("��˹���汻������\n");
	}
}
