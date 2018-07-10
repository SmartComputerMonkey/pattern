package com.designpatterns.chainofresponsibilitypattern.pattern01;

import java.util.ArrayList;
import java.util.Random;

import com.designpatterns.chainofresponsibilitypattern.IWomen;

public class Client {
	
	public static void main(String[] args) {
		// �����ѡ����Ů��
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4), "��Ҫ��ȥ���"));
		}

		// ����������ʾ����
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
