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
			if (this.nextHandler != null) { // 有后续环节，才把请求往后递送
				this.nextHandler.HandleMessage(women);
			} else { // 已经没有后续处理人了，不用处理了
				System.out.println("-----------没地方请示了，不做处理！---------\n");
			}
		}
	}

	/*
	 * 如果你属于你处理的返回，你应该让她找下一个环节的人，比如 女儿出嫁了，还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
	 */
	public void setNext(Handler _handler) {
		this.nextHandler = _handler;
	}

	// 有请示那当然要回应
	public abstract void response(IWomen women);
}
