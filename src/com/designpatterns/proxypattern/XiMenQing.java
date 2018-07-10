package com.designpatterns.proxypattern;

public class XiMenQing {

	public static void main(String[] args) {
		
		WangPo wangPo = new WangPo();
		wangPo.happyWithMan();
		wangPo.makeEyesWithMan();
		
		JiaShi jiaShi = new JiaShi();
		WangPo wangPo2 = new WangPo(jiaShi);
		wangPo2.happyWithMan();
		wangPo2.makeEyesWithMan();
		
	}
}
