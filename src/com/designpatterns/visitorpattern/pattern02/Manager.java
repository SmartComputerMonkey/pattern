package com.designpatterns.visitorpattern.pattern02;

public class Manager extends Employee {

	private String performance;
	
	public String getPerformance() {
		return performance;
	}


	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	protected void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
