package com.patterns.stragegy.mystragegy.dowork;

public class Cook implements DoWork {

	@Override
	public void doWhatJob() {
		System.out.println("-----做厨师工作-------");
	}

}
