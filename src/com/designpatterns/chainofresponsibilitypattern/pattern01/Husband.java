package com.designpatterns.chainofresponsibilitypattern.pattern01;

import com.designpatterns.chainofresponsibilitypattern.IWomen;

public class Husband extends Handler {

	public Husband(){
		super(2);
	}
	
	@Override
	public void response(IWomen women) {
		System.out.println("--------妻子向丈夫请示-------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：同意\n");
	}

}
