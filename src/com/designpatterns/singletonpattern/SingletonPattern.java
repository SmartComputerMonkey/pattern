package com.designpatterns.singletonpattern;

public class SingletonPattern {
	
	private static SingletonPattern singletonPattern = null;
	
	private SingletonPattern() {
		
	}
	
	public SingletonPattern getInstance() {
		
		/**
		 	假如现在有两个线程A 和线程B，线程A 执行到 this.singletonPattern =
			new SingletonPattern()，正在申请内存分配，可能需要0.001 微秒，就在这0.001 微秒之内，线程B 执
			行到if(this.singletonPattern == null)，你说这个时候这个判断条件是true 还是false？是true，那
			然后呢？线程B 也往下走，于是乎就在内存中就有两个SingletonPattern 的实例了，看看是不是出问题了？
		 */
		if(this.singletonPattern == null) {
			this.singletonPattern = new SingletonPattern();
		}
		return singletonPattern;
	}
}
