package com.designpatterns.visitorpattern.pattern04;


public interface IVisitor {
	
	public void visit(CommonEmployee commonEmployee);
	
	public void visit(Manager manager);
}
