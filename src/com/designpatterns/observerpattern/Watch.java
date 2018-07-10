package com.designpatterns.observerpattern;

public class Watch extends Thread {
	
	private HanFeiZi hanFeiZi;
	
	private LiSi liSi;
	
	private String type;
	
	public Watch(HanFeiZi _hanFeiZi,LiSi _liSi,String _type){
		
		this.hanFeiZi = _hanFeiZi;
		
		this.liSi = _liSi;
		
		this.type = _type;
	}
	
	public void run(){
		
		while(true) {
			if (this.type.equals("breakfase")) {
				if (this.hanFeiZi.isHaveBreakfast()) {
					this.liSi.update("韩非子在吃饭");
					this.hanFeiZi.setHaveBreakfast(false);
				}
			} else {
				if (this.hanFeiZi.isHaveFun()) {
					this.liSi.update("韩非子在娱乐");
					this.hanFeiZi.setHaveFun(false);
				}
			}
		}
	}
}
