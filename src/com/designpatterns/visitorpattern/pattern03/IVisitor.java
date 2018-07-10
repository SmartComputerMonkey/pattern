package com.designpatterns.visitorpattern.pattern03;


public interface IVisitor {
	
	public void visit(CommonEmployee commonEmployee);
	
	public void visit(Manager manager);
	
	public int getTotalSalary();
}
