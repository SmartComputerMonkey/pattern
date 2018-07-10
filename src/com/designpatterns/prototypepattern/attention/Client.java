package com.designpatterns.prototypepattern.attention;

/**
 * 对象拷贝时，类的构造函数是不会被执行的。
 * @author Administrator
 *
 */

public class Client {
	
	public static void main(String[] args) {
		Thing thing = new Thing();
		Thing cloneThing = thing.clone();
	}
}
