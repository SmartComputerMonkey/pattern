package com.designpatterns.commandpattern;

public class DetelePageCommand extends Command {

	@Override
	public void execute() {

		super.pg.find();
		
		super.rg.delete();
		
		super.rg.plan();
	}

}
