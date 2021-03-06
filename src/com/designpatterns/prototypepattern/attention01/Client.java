package com.designpatterns.prototypepattern.attention01;

/**
 * 浅拷贝和深拷贝问题
 * 
 * 浅拷贝：
 * 	是因为Java 做了一个偷懒的拷贝动作，Object 类提供的方法clone 只是拷贝本对象，
	其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝，
	确实是非常浅，两个对象共享了一个私有变量，你改我改大家都能改，是一个种非常不安全的方式，在实
	际项目中使用还是比较少的。你可能会比较奇怪，为什么在Mail 那个类中就可以使用使用String 类型，
	而不会产生由浅拷贝带来的问题呢？内部的数组和引用对象才不拷贝，其他的原始类型比如
	int,long,String(Java 就希望你把String 认为是基本类型，String 是没有clone 方法的)等都会被拷贝的。
 * 
 * 深拷贝：
 * 	这个实现了完全的拷贝，两个对象之间没有任何的瓜葛了，你修改你的，我修改我的，不相互影响，
	这种拷贝就叫做深拷贝，深拷贝还有一种实现方式就是通过自己写二进制流来操作对象
 * @author Administrator
 *
 *Clone 与final 两对冤家
 *	对象的clone 与对象内的final 属性是由冲突的
 */

public class Client {
	
	public static void main(String[] args) {
		
		Thing thing = new Thing();
		
		thing.setValue("张三");
		
		Thing cloneThing = thing.clone();
		cloneThing.setValue("李四");
		
		System.out.println(thing.getValue());
	}
}
