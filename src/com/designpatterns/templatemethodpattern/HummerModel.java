package com.designpatterns.templatemethodpattern;

public abstract class HummerModel {

	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	protected boolean isAlarm() {
		return true;
	}
	final public void run() {
		//�ȷ�������
		this.start();
		//���濪ʼ����
		this.engineBoom();
		//��������������죬����������Ͳ���
		if(this.isAlarm()){
			this.alarm();
		}
		//����Ŀ�ĵؾ�ͣ��
		this.stop();
	}
}
