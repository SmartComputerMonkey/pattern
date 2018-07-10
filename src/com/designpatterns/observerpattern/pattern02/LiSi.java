package com.designpatterns.observerpattern.pattern02;

public class LiSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("��˹���۲쵽��˹�����ʼ���ϰ�㱨��...");
		this.reportToQiShiHuang(context);
		System.out.println("��˹���㱨��ϣ����ϰ��͸��������ܲ��Գ�...\n");
	}
	
	// �㱨����ʼ��
	private void reportToQiShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}
}
