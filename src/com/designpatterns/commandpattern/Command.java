package com.designpatterns.commandpattern;

public abstract class Command {
	
	protected RequirementGroup rg = new RequirementGroup(); 
	protected PageGroup pg = new PageGroup(); 
	protected CodeGroup cg = new CodeGroup();
	
	public abstract void execute();
}
