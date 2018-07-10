package com.designpatterns.commandpattern;

public class Client {
	
	public static void main(String[] args) {
		
		Invoker XiaoSan = new Invoker();
		
		System.out.println("-------------客户要求增加一项需求-----------------");
		
		Command command = new AddRequeirementCommand();
		
		XiaoSan.setCommand(command);
		XiaoSan.action();
	}
}
