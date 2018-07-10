package com.designpatterns.abstractfactorypattern;

public enum HumanEnum {
					 
	YellowMaleHuman("com.designpatterns.abstractfactorypattern.YellowMaleHuman"),
	YelloFemaleHuman("com.designpatterns.abstractfactorypattern.YellowFemaleHuman"),
	WhiteMaleHuman("com.designpatterns.abstractfactorypattern.WhiteMaleHuman"),
	WhiteFemaleHuman("com.designpatterns.abstractfactorypattern.WhiteFemaleHuman"),
	BlackMaleHuman("com.designpatterns.abstractfactorypattern.BlackMaleHuman"),
	BlackFemaleHuman("com.designpatterns.abstractfactorypattern.YelloMaleHuman");
	
	private String value = "";
	
	private HumanEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
