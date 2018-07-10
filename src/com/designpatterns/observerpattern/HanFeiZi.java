package com.designpatterns.observerpattern;

public class HanFeiZi implements IHanFeiZi {

	//�������Ƿ��ڳԷ�����Ϊ��ص��жϱ�׼
	private boolean isHaveBreakfast = false;
	//�������Ƿ�������
	private boolean isHaveFun = false;
	
	public boolean isHaveBreakfast() {
		return isHaveBreakfast;
	}

	public void setHaveBreakfast(boolean isHaveBreakfast) {
		this.isHaveBreakfast = isHaveBreakfast;
	}

	public boolean isHaveFun() {
		return isHaveFun;
	}

	public void setHaveFun(boolean isHaveFun) {
		this.isHaveFun = isHaveFun;
	}

	@Override
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		this.isHaveBreakfast =true;
	}

	@Override
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.isHaveFun = true;
	}

}
