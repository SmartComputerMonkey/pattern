package com.designpatterns.templatemethodpattern;

public abstract class HummerModel {

	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	protected boolean isAlarm() {
		return true;
	}
	final public void run() {
		//先发动汽车
		this.start();
		//引擎开始轰鸣
		this.engineBoom();
		//喇嘛想让它响就响，不想让它响就不响
		if(this.isAlarm()){
			this.alarm();
		}
		//到达目的地就停车
		this.stop();
	}
}
