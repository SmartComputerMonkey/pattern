package com.designpatterns.templatemethodpattern;

public class Client {
	
	public static void main(String[] args) {
		//�ͻ�����H1�ͺţ���ȥ������
		HummerModel h1 = new HummerH1Model();
		HummerH1Model hummerH1Model = new HummerH1Model();
		hummerH1Model.setAlarm(true);
		hummerH1Model.run();
//		h1.run(); //�����������ˣ�
		//�ͻ���H2�ͺţ���ȥ��ˣ��
//		HummerModel h2 = new HummerH2Model();
//		h2.run();
	}
}
