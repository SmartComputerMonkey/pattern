package com.designpatterns.prototypepattern.attention01;

/**
 * ǳ�������������
 * 
 * ǳ������
 * 	����ΪJava ����һ��͵���Ŀ���������Object ���ṩ�ķ���clone ֻ�ǿ���������
	������ڲ������顢���ö���ȶ�������������ָ��ԭ��������ڲ�Ԫ�ص�ַ�����ֿ����ͽ���ǳ������
	ȷʵ�Ƿǳ�ǳ��������������һ��˽�б���������ҸĴ�Ҷ��ܸģ���һ���ַǳ�����ȫ�ķ�ʽ����ʵ
	����Ŀ��ʹ�û��ǱȽ��ٵġ�����ܻ�Ƚ���֣�Ϊʲô��Mail �Ǹ����оͿ���ʹ��ʹ��String ���ͣ�
	�����������ǳ���������������أ��ڲ�����������ö���Ų�������������ԭʼ���ͱ���
	int,long,String(Java ��ϣ�����String ��Ϊ�ǻ������ͣ�String ��û��clone ������)�ȶ��ᱻ�����ġ�
 * 
 * �����
 * 	���ʵ������ȫ�Ŀ�������������֮��û���κεĹϸ��ˣ����޸���ģ����޸��ҵģ����໥Ӱ�죬
	���ֿ����ͽ���������������һ��ʵ�ַ�ʽ����ͨ���Լ�д������������������
 * @author Administrator
 *
 *Clone ��final ����ԩ��
 *	�����clone ������ڵ�final �������ɳ�ͻ��
 */

public class Client {
	
	public static void main(String[] args) {
		
		Thing thing = new Thing();
		
		thing.setValue("����");
		
		Thing cloneThing = thing.clone();
		cloneThing.setValue("����");
		
		System.out.println(thing.getValue());
	}
}
