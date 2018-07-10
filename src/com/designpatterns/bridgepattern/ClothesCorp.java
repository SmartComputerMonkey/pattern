package com.designpatterns.bridgepattern;

public class ClothesCorp extends Corp {

	@Override
	protected void produce() {
		System.out.println("��װ��˾�����·�...");
	}

	@Override
	protected void sell() {
		System.out.println("��װ��˾�����·�...");
	}

	public void makeMoney() {
		super.makeMoney();
		System.out.println("��װ��˾׬СǮ...");
	}
}
