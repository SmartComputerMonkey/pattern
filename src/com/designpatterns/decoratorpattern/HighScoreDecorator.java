package com.designpatterns.decoratorpattern;

public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportHighScore(){
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}
	
	public void report(){
		this.reportHighScore();
		super.report();
	}
}
