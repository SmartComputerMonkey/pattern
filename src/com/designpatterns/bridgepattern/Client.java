package com.designpatterns.bridgepattern;

import com.designpatterns.bridgepattern.implementor.Clothes;
import com.designpatterns.bridgepattern.implementor.House;
import com.designpatterns.bridgepattern.implementor.IPod;
import com.designpatterns.bridgepattern.abstraction.HouseCorp;
import com.designpatterns.bridgepattern.abstraction.ShanZhaiCorp;
public class Client {
	
	/**
	 * 
	 * ����ģʽ���ŵ������������������Ѿ��ᵽ��������ɫ�������Լ�����չ��ȥ�������໥Ӱ�죬���
		Ҳ����OCP ԭ��
	 */
	
	public static void main(String[] args) {
		
		/*System.out.println("-------���ز���˾������������е�-------");
		HouseCorp houseCorp = new HouseCorp();
		houseCorp.makeMoney();
		System.out.println();
		
		System.out.println("-------��װ��˾���������е�-------");
		ClothesCorp colthCorp = new ClothesCorp();
		colthCorp.makeMoney();
		
		System.out.println("-------ɽկ��˾���������е�-------");
		IPodCorp iPodCorp = new IPodCorp();
		iPodCorp.makeMoney();*/
		
		House house = new House();
		System.out.println("-------���ز���˾������������е�-------");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println();
		
		System.out.println("-------ɽկ��˾���������е�-------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		ShanZhaiCorp shanZhaiCorp2 = new ShanZhaiCorp(new IPod());
		shanZhaiCorp2.makeMoney();
		shanZhaiCorp.makeMoney();
		
	}
}
