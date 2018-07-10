package com.designpatterns.visitorpattern.pattern01;

public class CommonEmployee extends Employee {

	private String job;
	
	
	
	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	@Override
	protected String getOtherInfo() {
		return "������"+ this.job + "\t";
	}

}
