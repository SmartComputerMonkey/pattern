package com.designpatterns.abstractfactorypattern;

import com.designpatterns.factorymethodpattern.Human;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("白色人种会大笑，幸福呀！");

	}

	@Override
	public void cry() {
		System.out.println("白色人种会哭");

	}

	@Override
	public void talk() {
		System.out.println("白色人种会说话，一般说的都是双字节");

	}

}
