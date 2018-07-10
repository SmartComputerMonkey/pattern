package com.designpatterns.builderpattern;

import java.util.ArrayList;

public abstract class CarModel {

	private ArrayList<String> squence = new ArrayList<String>();
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	final public void run() {
		
		for (int i = 0; i < this.squence.size(); i++) {
			
			String actionName = this.squence.get(i); 
			
			if (actionName.equalsIgnoreCase("start")) {
				this.start();
			} else if (actionName.equalsIgnoreCase("stop")) {
				this.stop();
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom();
			}
		}
	}
	
	final public void setSequence(ArrayList<String> squence) {
		this.squence = squence;
	}
}
