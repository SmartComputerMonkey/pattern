package com.designpatterns.observerpattern;

public class LiSi implements ILiSi {

	@Override
	public void update(String context) {
		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨��...");
		this.reportToQiShiHuang(context);
		System.out.println("��˹���㱨��ϣ����ϰ��͸��������ܲ��Գ�...\n");
	}

	// �㱨����ʼ��
	private void reportToQiShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}
}
