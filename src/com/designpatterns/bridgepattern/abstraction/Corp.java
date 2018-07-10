package com.designpatterns.bridgepattern.abstraction;

import com.designpatterns.bridgepattern.implementor.Product;

public abstract class Corp {

	private Product product;
	
	public Corp (Product product) {
		this.product = product;
	}
	
	public void makeMoney() {
		
		this.product.beProducted();
		
		this.product.beSelled();
	}
}
