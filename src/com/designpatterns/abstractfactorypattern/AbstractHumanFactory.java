package com.designpatterns.abstractfactorypattern;

public abstract class AbstractHumanFactory implements HumanFactory {

	protected Human createHuman(HumanEnum humanEnum) {
		
		Human human = null;
		
		if (!"".equals(humanEnum.getValue())) {
			try {
				human = (Human) Class.forName(humanEnum.getValue()).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		return human;
	}

}
