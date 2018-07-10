package com.designpatterns.bridgepattern;

import com.designpatterns.bridgepattern.implementor.Clothes;
import com.designpatterns.bridgepattern.implementor.House;
import com.designpatterns.bridgepattern.implementor.IPod;
import com.designpatterns.bridgepattern.abstraction.HouseCorp;
import com.designpatterns.bridgepattern.abstraction.ShanZhaiCorp;
public class Client {
	
	/**
	 * 
	 * 桥梁模式的优点就是类间解耦，我们上面已经提到，两个角色都可以自己的扩展下去，不会相互影响，这个
		也符合OCP 原则
	 */
	
	public static void main(String[] args) {
		
		/*System.out.println("-------房地产公司是这个样子运行的-------");
		HouseCorp houseCorp = new HouseCorp();
		houseCorp.makeMoney();
		System.out.println();
		
		System.out.println("-------服装公司是这样运行的-------");
		ClothesCorp colthCorp = new ClothesCorp();
		colthCorp.makeMoney();
		
		System.out.println("-------山寨公司是这样运行的-------");
		IPodCorp iPodCorp = new IPodCorp();
		iPodCorp.makeMoney();*/
		
		House house = new House();
		System.out.println("-------房地产公司是这个样子运行的-------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println();
		
		System.out.println("-------山寨公司是这样运行的-------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		ShanZhaiCorp shanZhaiCorp2 = new ShanZhaiCorp(new IPod());
		shanZhaiCorp2.makeMoney();
		shanZhaiCorp.makeMoney();
		
	}
}
