package com.designpatterns.observerpattern;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		Watch watchBreakfast = new Watch(hanFeiZi,liSi,"breakfasr");
		watchBreakfast.start();
		
		//观察娱乐情况
		Watch watchFun = new Watch(hanFeiZi,liSi,"fun");
		watchFun.start();
		
		//然后这里我们看看韩非子在干什么
		Thread.sleep(1000); //主线程等待1秒后后再往下执行
		hanFeiZi.haveBreakfast();
		//韩非子娱乐了
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}
}
