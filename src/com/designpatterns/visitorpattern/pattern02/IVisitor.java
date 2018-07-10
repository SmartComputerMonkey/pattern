package com.designpatterns.visitorpattern.pattern02;


public interface IVisitor {
	
	public void visit(CommonEmployee commonEmployee);
	
	public void visit(Manager manager);
}
