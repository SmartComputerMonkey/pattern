package com.designpatterns.observerpattern.parttern01;

import com.designpatterns.observerpattern.ILiSi;
import com.designpatterns.observerpattern.LiSi;

public class HanFeiZi implements IHanFeiZi {

	private ILiSi liSi = new LiSi();
	

	@Override
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		this.liSi.update("�������ڳԷ�");
	}

	@Override
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.liSi.update("������������");
	}

}
