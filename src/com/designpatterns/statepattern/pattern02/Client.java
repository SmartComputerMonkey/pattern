package com.designpatterns.statepattern.pattern02;

public class Client {
	
	public static void main(String[] args) {
		ILift lift = new Lift();
		//���ݵĳ�ʼ����Ӧ����ֹͣ״̬
		lift.setState(ILift.STOPPING_STATE);
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
