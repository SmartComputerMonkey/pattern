package com.designpatterns.factorymethodpattern;

public class BlackHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("���˻��");

	}

	@Override
	public void cry() {
		System.out.println("���˻�Ц");

	}

	@Override
	public void talk() {
		System.out.println("���˿���˵����һ����������");

	}

}
