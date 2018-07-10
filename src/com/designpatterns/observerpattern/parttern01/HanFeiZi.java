package com.designpatterns.observerpattern.parttern01;

import com.designpatterns.observerpattern.ILiSi;
import com.designpatterns.observerpattern.LiSi;

public class HanFeiZi implements IHanFeiZi {

	private ILiSi liSi = new LiSi();
	

	@Override
	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		this.liSi.update("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		this.liSi.update("韩非子在娱乐");
	}

}
