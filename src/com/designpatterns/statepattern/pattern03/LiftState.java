package com.designpatterns.statepattern.pattern03;

public abstract class LiftState {
	
	protected Context context;
	
	public void setContext(Context _context){
		this.context = _context;
	}
	
	//���ȵ����ſ�������
	public abstract void open();
	//�������п������ǵ�ȻҲ���йر���
	public abstract void close();
	//����Ҫ�������£�������
	public abstract void run();
	//���ݻ�Ҫ��ͣ������ͣ�������Ǿͳ�����
	public abstract void stop();
}
