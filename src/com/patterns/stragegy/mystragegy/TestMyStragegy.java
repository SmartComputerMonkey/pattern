package com.patterns.stragegy.mystragegy;

import com.patterns.stragegy.mystragegy.dowork.Driver;
import com.patterns.stragegy.mystragegy.people.CCook;
import com.patterns.stragegy.mystragegy.people.DDriver;
import com.patterns.stragegy.mystragegy.people.Engineer;
import com.patterns.stragegy.mystragegy.people.People;
import com.patterns.stragegy.mystragegy.skill.CanDrive;

public class TestMyStragegy {
	
	public static void main(String[] args) {
		People cook = new CCook();
		People driver = new DDriver();
		People engineer = new Engineer();
		
		cook.Breathing();
		cook.run();
		cook.mySkill();
		cook.doWhatJob();
		
		driver.Breathing();
		driver.run();
		driver.mySkill();
		driver.doWhatJob();
		
		engineer.Breathing();
		engineer.run();
		engineer.setSkill(new CanDrive());
		engineer.setDoWork(new Driver());
		engineer.mySkill();
		engineer.doWhatJob();
	}
}
