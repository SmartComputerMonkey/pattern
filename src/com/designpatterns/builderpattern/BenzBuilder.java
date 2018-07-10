package com.designpatterns.builderpattern;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

	private BenzModel benz = new BenzModel();
	
	@Override
	public void setSquence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
