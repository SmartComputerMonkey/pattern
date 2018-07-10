package com.patterns.stragegy.mystragegy.people;

import com.patterns.stragegy.mystragegy.dowork.DoWork;
import com.patterns.stragegy.mystragegy.skill.Skill;

public abstract class People {
	
	DoWork doWork;
	Skill skill;
	
	People(){
		
	}
	public void doWhatJob() {
		doWork.doWhatJob();
	}
	public void mySkill() {
		skill.mySkill();
	}
	public void run() {
		System.out.println("�ܲ�������");
	}
	public void Breathing () {
		System.out.println("�����");
	}
	public abstract void Language();
	
	public void setDoWork(DoWork doWork) {
		this.doWork = doWork;
	}
	
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	
}
