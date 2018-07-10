package com.designpatterns.singletonpattern;

public class SingletonPattern {
	
	private static SingletonPattern singletonPattern = null;
	
	private SingletonPattern() {
		
	}
	
	public SingletonPattern getInstance() {
		
		/**
		 	���������������߳�A ���߳�B���߳�A ִ�е� this.singletonPattern =
			new SingletonPattern()�����������ڴ���䣬������Ҫ0.001 ΢�룬������0.001 ΢��֮�ڣ��߳�B ִ
			�е�if(this.singletonPattern == null)����˵���ʱ������ж�������true ����false����true����
			Ȼ���أ��߳�B Ҳ�����ߣ����Ǻ������ڴ��о�������SingletonPattern ��ʵ���ˣ������ǲ��ǳ������ˣ�
		 */
		if(this.singletonPattern == null) {
			this.singletonPattern = new SingletonPattern();
		}
		return singletonPattern;
	}
}
