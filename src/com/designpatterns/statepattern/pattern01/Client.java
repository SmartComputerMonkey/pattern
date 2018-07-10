package com.designpatterns.statepattern.pattern01;

public class Client {
	
	public static void main(String[] args) {
		ILift lift = new Lift();
		//�����ǵ����ſ������˽�ȥ
		lift.open();
		//Ȼ������Źر�
		lift.close();
		//��Ȼ�󣬵��������������ϻ�������
		lift.run();
		//��󵽴�Ŀ�ĵأ�����ͦ����
		lift.stop();
	}
}
