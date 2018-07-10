package com.designpatterns.observerpattern;

public class HanFeiZi implements IHanFeiZi {

	//韩非子是否在吃饭，作为监控的判断标准
	private boolean isHaveBreakfast = false;
	//韩非子是否在娱乐
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
		System.out.println("韩非子:开始吃饭了...");
		this.isHaveBreakfast =true;
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		this.isHaveFun = true;
	}

}
