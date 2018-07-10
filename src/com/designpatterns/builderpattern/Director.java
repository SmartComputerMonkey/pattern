package com.designpatterns.builderpattern;

import java.util.ArrayList;

/*
 * A 型号的奔驰车辆模型是只有启动（start）、停止(stop)方法，其他的引擎声音、喇叭都没有;
	B 型号的奔驰车是先发动引擎（engine boom）,然后启动(star),再然后停车(stop),没有喇叭；
	C 型号的宝马车是先喇叭叫一下（alarm），然后（start）,再然后是停车(stop)，引擎不轰鸣；
	D 型号的宝马车就一个启动(start)，然后一路跑到黑，永动机，没有停止方法，没有喇叭，没有引擎轰鸣；
	E 型号、F 型号…等等，可以有很多，启动(start)、停止(stop)、喇叭(alarm)、引擎轰鸣(engine boom)
	
	
	
	
	如果你要调用类中的成员变量或方法，需要在前面加上this 关键字，不加也能正常的跑起来，但是不清晰，加上this 关键字，
	我就是要调用本类中成员变量或方法，而不是本方法的中的一个变量，还有super 方法也是一样，是调用父类的的成员变
	量或者方法，那就加上这个关键字，不要省略
	
	ArrayList 和HashMap 如果定义成类的成员变量，那你在方法中调用一定要做一个clear 的动作，防止数据混乱
	
	
	建造者模式使用的场景，一是产品类非常的复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时
	候使用建造者模式是非常合适，我曾在一个银行交易类项目中遇到了这个问题，一个产品的定价计算模型有N 多
	种，每个模型有固定的计算步骤，计算非常复杂，项目中就使用了建造者模式；二是“ 在对象创建过程中会使
	用到系统中的一些其它对象，这些对象在产品对象的创建过程中不易得到”，
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
