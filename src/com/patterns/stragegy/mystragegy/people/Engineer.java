package com.patterns.stragegy.mystragegy.people;

import com.patterns.stragegy.mystragegy.dowork.SoftwareEngineerJob;
import com.patterns.stragegy.mystragegy.skill.CanProgramming;

public class Engineer extends People {

	
	
	public Engineer() {
		super();
		doWork = new SoftwareEngineerJob();
		skill = new CanProgramming();
	}

	@Override
	public void Language() {
		System.out.println("½²ºÓ±±»°");
	}

}
