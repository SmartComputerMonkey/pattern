package com.designpatterns.multitionpattern;

@SuppressWarnings("all")
public class Minister {
	
	public static void main(String[] args) {
		
		int ministerNum = 10;
		
		for(int i = 0;i < ministerNum; i++ ) {
			
			Emperor emperor = Emperor.getInstance();
			System.out.println("��" + (i+1) +"���󳼲Ұݵ��ǣ�");
			emperor.emperorInfo();
		}
	}
}
