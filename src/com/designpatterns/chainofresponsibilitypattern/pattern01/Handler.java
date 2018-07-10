package com.designpatterns.chainofresponsibilitypattern.pattern01;

import com.designpatterns.chainofresponsibilitypattern.IWomen;

public abstract class Handler {

	private int level = 0;

	private Handler nextHandler;

	public Handler(int _level) {
		this.level = _level;
	}

	public final void HandleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) { // �к������ڣ��Ű������������
				this.nextHandler.HandleMessage(women);
			} else { // �Ѿ�û�к����������ˣ����ô�����
				System.out.println("-----------û�ط���ʾ�ˣ���������---------\n");
			}
		}
	}

	/*
	 * ����������㴦��ķ��أ���Ӧ����������һ�����ڵ��ˣ����� Ů�������ˣ���������ʾ�Ƿ���Թ�֣��Ǹ��׾�Ӧ�ø���Ů����Ӧ�����ɷ���ʾ
	 */
	public void setNext(Handler _handler) {
		this.nextHandler = _handler;
	}

	// ����ʾ�ǵ�ȻҪ��Ӧ
	public abstract void response(IWomen women);
}
