package com.designpatterns.chainofresponsibilitypattern.pattern01;

import java.util.ArrayList;
import java.util.Random;

import com.designpatterns.chainofresponsibilitypattern.IWomen;

public class Client {
	
	public static void main(String[] args) {
		// 随机挑选几个女性
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}

		// 定义三个请示对象
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		
		for (IWomen iWomen : arrayList) {
			father.HandleMessage(iWomen);
		}
	}
}
