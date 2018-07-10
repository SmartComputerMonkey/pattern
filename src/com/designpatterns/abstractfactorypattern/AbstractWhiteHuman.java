package com.designpatterns.abstractfactorypattern;

import com.designpatterns.factorymethodpattern.Human;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("��ɫ���ֻ��Ц���Ҹ�ѽ��");

	}

	@Override
	public void cry() {
		System.out.println("��ɫ���ֻ��");

	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽ�");

	}

}
