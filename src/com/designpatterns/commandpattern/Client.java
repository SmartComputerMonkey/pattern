package com.designpatterns.commandpattern;

public class Client {
	
	public static void main(String[] args) {
		
		Invoker XiaoSan = new Invoker();
		
		System.out.println("-------------�ͻ�Ҫ������һ������-----------------");
		
		Command command = new AddRequeirementCommand();
		
		XiaoSan.setCommand(command);
		XiaoSan.action();
	}
}
