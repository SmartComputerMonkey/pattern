package com.designpatterns.builderpattern;

import java.util.ArrayList;

/*
 * A �ͺŵı��۳���ģ����ֻ��������start����ֹͣ(stop)�������������������������ȶ�û��;
	B �ͺŵı��۳����ȷ������棨engine boom��,Ȼ������(star),��Ȼ��ͣ��(stop),û�����ȣ�
	C �ͺŵı����������Ƚ�һ�£�alarm����Ȼ��start��,��Ȼ����ͣ��(stop)�����治������
	D �ͺŵı�����һ������(start)��Ȼ��һ·�ܵ��ڣ���������û��ֹͣ������û�����ȣ�û�����������
	E �ͺš�F �ͺš��ȵȣ������кܶ࣬����(start)��ֹͣ(stop)������(alarm)���������(engine boom)
	
	
	
	
	�����Ҫ�������еĳ�Ա�����򷽷�����Ҫ��ǰ�����this �ؼ��֣�����Ҳ�������������������ǲ�����������this �ؼ��֣�
	�Ҿ���Ҫ���ñ����г�Ա�����򷽷��������Ǳ��������е�һ������������super ����Ҳ��һ�����ǵ��ø���ĵĳ�Ա��
	�����߷������Ǿͼ�������ؼ��֣���Ҫʡ��
	
	ArrayList ��HashMap ����������ĳ�Ա�����������ڷ����е���һ��Ҫ��һ��clear �Ķ�������ֹ���ݻ���
	
	
	������ģʽʹ�õĳ�����һ�ǲ�Ʒ��ǳ��ĸ��ӣ����߲�Ʒ���еĵ���˳��ͬ�����˲�ͬ��Ч�ܣ����ʱ
	��ʹ�ý�����ģʽ�Ƿǳ����ʣ�������һ�����н�������Ŀ��������������⣬һ����Ʒ�Ķ��ۼ���ģ����N ��
	�֣�ÿ��ģ���й̶��ļ��㲽�裬����ǳ����ӣ���Ŀ�о�ʹ���˽�����ģʽ�����ǡ� �ڶ��󴴽������л�ʹ
	�õ�ϵͳ�е�һЩ����������Щ�����ڲ�Ʒ����Ĵ��������в��׵õ�����
 * */
public class Director {
	
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	public BenzModel getABenzModel() {
		this.sequence.clear();
		
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.benzBuilder.setSquence(this.sequence);
		
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	public BenzModel getBBenzModel() {
		this.sequence.clear();
		
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.benzBuilder.setSquence(this.sequence);
		
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	public BMWModel getCBMWModel() {
		this.sequence.clear();
		
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		
		this.bmwBuilder.setSquence(this.sequence);
		
		return  (BMWModel)this.bmwBuilder.getCarModel();
	}
	
	public BMWModel getDBMWModel() {
		this.sequence.clear();
		
		this.sequence.add("start");
		
		this.bmwBuilder.setSquence(this.sequence);
		
		return  (BMWModel)this.bmwBuilder.getCarModel();
	}
}
