package com.designpatterns.facadepattern;

/*����ģʽ������ϣ�����һ���ܺõķ�װ������һ����ϵͳ�Ƚϸ��ӵ�ʵ���������㷨����ҵ��Ƚ�
���ӣ��Ϳ��Է�װ��һ�����������������Ŀ�Ľṹ�򵥣�������չ�Էǳ��á����У���һ���ϴ���Ŀ
�е�ʱ��Ϊ�˱�����Ա�����ķ��գ�Ҳ����ʹ�����ģʽ������ˮƽ�Ƚϲ�ĳ�Ա���������Ŷ�����ģ
�飨Sub System����Ȼ�����д�ĳ����װ��һ�������������������Ŀ��Ա���ÿ�����Щ���˵Ĵ��룬
��Ҳ����������Ҳ������һ�������ˡ�д�Ĵ��룬private ���������캯�����������������ã���Ҫһ��
public �������ã�һ�������һ��public ���������д��붼�����棬Ȼ����Ϳ��ɣ�һ����ĳ��򣬿���
�ܰ��˱Ʒ裬ʹ������ģʽ�󣬶�������е�Ԫ���ԣ�Լ����Ŀ��Ա�Ĵ�������������Ŀ��������������
Ҳ��һ���ȽϺõİ�����*/
public class Client {
	
	public static void main(String[] args) {
		
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		
		String address = "Happy Road No. 666,God Province,Heaven";
		String context = "Hello,It's me,do you know who I am? I'm your old lover.I'd like to....";
		
		hellRoadPostOffice.sendLetter(context, address);
	}
}
