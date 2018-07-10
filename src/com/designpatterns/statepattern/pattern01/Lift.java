package com.designpatterns.statepattern.pattern01;

public class Lift implements ILift {

	@Override
	public void open() {
		System.out.println("�����ſ���...");
	}

	@Override
	public void close() {
		System.out.println("�����Źر�...");
	}

	@Override
	public void run() {
		System.out.println("��������������...");
	}

	@Override
	public void stop() {
		System.out.println("����ֹͣ��...");
	}

}
