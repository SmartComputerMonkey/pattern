package com.designpatterns.statepattern.pattern03;

public class ClosingState extends LiftState {

	@Override
	public void open() {
		super.context.setLiftState(Context.openningState); //��Ϊ�ų�״̬
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("�����Źر�...");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.runningState); //����Ϊ����״̬��
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState); //����Ϊֹͣ״̬��
		super.context.getLiftState().stop();
	}

}
