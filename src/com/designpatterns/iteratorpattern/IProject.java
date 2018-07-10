package com.designpatterns.iteratorpattern;

public interface IProject {
	
	public String getProjectInfo();
	
	public void add(String name,int num, int cost);
	
	public IProjectIterator iterator();
}
