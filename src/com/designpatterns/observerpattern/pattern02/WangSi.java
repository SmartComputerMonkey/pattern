package com.designpatterns.observerpattern.pattern02;

public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
		this.cry(context);
		System.out.println("王斯：真真的哭死了...\n");
	}
	
	// 一看李斯有活动，就哭，痛哭
	private void cry(String context) {
		System.out.println("王斯：因为" + context + "，——所以我悲伤呀！");
	}
}
