package com.patterns.stragegy.mystragegy.people;

import com.patterns.stragegy.mystragegy.dowork.Driver;
import com.patterns.stragegy.mystragegy.skill.CanDrive;

public class DDriver extends People {

	
	
	public DDriver() {
		super();
		doWork = new Driver();
		skill = new CanDrive();
	}

	@Override
	public void Language() {
		System.out.println("½²ºşÄÏ»°");
	}

}
