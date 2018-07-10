package com.patterns.stragegy.mystragegy.people;

import com.patterns.stragegy.mystragegy.dowork.Cook;
import com.patterns.stragegy.mystragegy.skill.CanCook;

public class CCook extends People {

	
	
	public CCook() {
		super();
		doWork = new Cook();
		skill = new CanCook();
	}

	@Override
	public void Language() {
		System.out.println("Ω≤‘¡”Ô");
	}

}
