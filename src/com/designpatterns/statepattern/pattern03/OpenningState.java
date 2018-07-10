package com.designpatterns.statepattern.pattern03;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("�����ſ���...");
	}

	@Override
	public void close() {
		//״̬�޸�
		super.context.setLiftState(Context.closeingState);
		//����ί��ΪCloseState��ִ��
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
