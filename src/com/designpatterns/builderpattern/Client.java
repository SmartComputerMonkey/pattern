package com.designpatterns.builderpattern;

import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) {
		
		/*BenzModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>();
		
		sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
		sequence.add("start"); //启动起来
		sequence.add("stop"); //开了一段就停下来
		
		benz.setSequence(sequence);
		benz.run();*/
		
		/*ArrayList<String> sequence = new ArrayList<String>();
		
		sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
		sequence.add("start"); //启动起来
		sequence.add("stop"); //开了一段就停下来
		
		BenzBuilder benzBuilder = new BenzBuilder();
		
		benzBuilder.setSquence(sequence);
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		benz.run();
		
		BMWBuilder bwmBuilder = new BMWBuilder();
		
		bwmBuilder.setSquence(sequence);
		BMWModel bmw = (BMWModel) bwmBuilder.getCarModel();
		bmw.run();*/
		
		Director director = new Director();
		
		for (int i = 0; i < 10; i++) {
			director.getABenzModel().run();
		}
		
		for (int i = 0; i < 10; i++) {
			director.getBBenzModel().run();
		}
		
		for (int i = 0; i < 10; i++) {
			director.getCBMWModel().run();
		}
		
		for (int i = 0; i < 10; i++) {
			director.getDBMWModel().run();
		}
		
		
		
	}
}
