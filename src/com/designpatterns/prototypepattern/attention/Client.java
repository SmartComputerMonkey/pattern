package com.designpatterns.prototypepattern.attention;

/**
 * ���󿽱�ʱ����Ĺ��캯���ǲ��ᱻִ�еġ�
 * @author Administrator
 *
 */

public class Client {
	
	public static void main(String[] args) {
		Thing thing = new Thing();
		Thing cloneThing = thing.clone();
	}
}
