package com.designpatterns.templatemethodpattern;

public class HummerH1Model extends HummerModel {

	private boolean alarmFlag = true;
	@Override
	public void start() {
		System.out.println("����H1����...");
	}

	@Override
	public void stop() {
		System.out.println("����H1ͣ��...");
	}

	@Override
	public void alarm() {
		System.out.println("����H1����...");
	}

	@Override
	public void engineBoom() {
		System.out.println("����H1����������������...");
	}

	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}
