package com.designpatterns.statepattern.pattern02;

public interface ILift {

	public final static int OPENING_STATE = 1; //ÃÅ³¨×´Ì¬
	public final static int CLOSING_STATE = 2; //ÃÅ±Õ×´Ì¬
	public final static int RUNNING_STATE = 3; //ÔËÐÐ×´Ì¬
	public final static int STOPPING_STATE = 4; //Í£Ö¹×´Ì¬£»
	
	public void setState(int state);
	
	public void open();
	
	public void close();
	
	public void run();
	
	public void stop();
}
