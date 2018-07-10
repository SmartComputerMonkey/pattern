package com.designpatterns.builderpattern;

import java.util.ArrayList;

public abstract class CarBuilder {

	public abstract void setSquence(ArrayList<String> sequence);
	
	public abstract CarModel getCarModel();
}
