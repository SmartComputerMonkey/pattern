package com.designpatterns.statepattern.pattern03;

public class RunningState extends LiftState {

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("����������...");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState); //��������Ϊֹͣ״̬��
		super.context.getLiftState().stop();
	}

}
