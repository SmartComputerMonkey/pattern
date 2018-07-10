package com.designpatterns.decoratorpattern;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
		// TODO Auto-generated constructor stub
	}

	private void reportSort(){
		System.out.println("����������38��...");
		}

	public void report(){
		super.report();
		this.reportSort();
	}
}
