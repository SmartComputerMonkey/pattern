package com.designpatterns.observerpattern.pattern03;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {

	// �㱨����ʼ��
	private void reportToQiShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}

	@Override
	public void update(Observable observable, Object obj) {
		System.out.println("��˹���۲쵽��˹�����ʼ���ϰ�㱨��...");
		this.reportToQiShiHuang(obj.toString());
		System.out.println("��˹���㱨��ϣ����ϰ��͸��������ܲ��Գ�...\n");
	}
}
