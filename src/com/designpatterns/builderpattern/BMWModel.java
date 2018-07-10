package com.designpatterns.builderpattern;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("������������������ӵ�...");
	}

	@Override
	protected void stop() {
		System.out.println("����Ӧ������ͣ��...");
	}

	@Override
	protected void alarm() {
		System.out.println("����������������������ӵ�...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("���������������������...");
	}

}
