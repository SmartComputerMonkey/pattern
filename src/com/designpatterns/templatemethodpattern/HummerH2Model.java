package com.designpatterns.templatemethodpattern;

public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("����H2����...");
	}

	@Override
	public void stop() {
		System.out.println("����H1ͣ��...");
	}

	@Override
	public void alarm() {
		System.out.println("����H2����...");
	}

	@Override
	public void engineBoom() {
		System.out.println("����H2����������������...");
	}

	protected boolean isAlarm() {
		return false;
	}
}
