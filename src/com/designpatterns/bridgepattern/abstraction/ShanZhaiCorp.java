package com.designpatterns.bridgepattern.abstraction;

import com.designpatterns.bridgepattern.implementor.Product;

public class ShanZhaiCorp extends Corp {

	public ShanZhaiCorp (Product product) {
		super(product);
	}

	public void makeMoney () {
		super.makeMoney();
		System.out.println("ÎÒ×¬Ç®Ñ½...");
	}
}
