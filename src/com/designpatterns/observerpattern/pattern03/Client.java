package com.designpatterns.observerpattern.pattern03;

import java.util.Observer;

public class Client {
	
	public static void main(String[] args) {
		//�����۲��߲�������
		Observer liSi = new LiSi();
		Observer wangSi = new WangSi();
		Observer liuSi = new LiuSi();
		
		//�����������
		HanFeiZi hanFeiZi = new HanFeiZi();
		//���Ǻ��˸�����ʷ������������������������ڹ۲캫����
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		hanFeiZi.addObserver(liuSi);
		
		//Ȼ���������ǿ����������ڸ�ʲô
		hanFeiZi.haveBreakfast();
	}
}
