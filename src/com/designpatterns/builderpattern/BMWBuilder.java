package com.designpatterns.builderpattern;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

	private BMWModel bwm = new BMWModel();
	
	@Override
	public void setSquence(ArrayList<String> sequence) {
		this.bwm.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bwm;
	}

}
