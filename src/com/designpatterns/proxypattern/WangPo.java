package com.designpatterns.proxypattern;

public class WangPo implements KindWomen {

	private KindWomen kindWomen;
	
	public WangPo() {
		this.kindWomen = new PanJinLian();
	}
	
	public WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	
	@Override
	public void makeEyesWithMan() {
		kindWomen.makeEyesWithMan();
	}

	@Override
	public void happyWithMan() {
		kindWomen.happyWithMan();
	}

}
