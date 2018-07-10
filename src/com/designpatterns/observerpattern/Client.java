package com.designpatterns.observerpattern;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		Watch watchBreakfast = new Watch(hanFeiZi,liSi,"breakfasr");
		watchBreakfast.start();
		
		//�۲��������
		Watch watchFun = new Watch(hanFeiZi,liSi,"fun");
		watchFun.start();
		
		//Ȼ���������ǿ����������ڸ�ʲô
		Thread.sleep(1000); //���̵߳ȴ�1����������ִ��
		hanFeiZi.haveBreakfast();
		//������������
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}
}
