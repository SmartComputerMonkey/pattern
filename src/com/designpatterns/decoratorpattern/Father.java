package com.designpatterns.decoratorpattern;

public class Father {

	public static void main(String[] args) {
//		//�������ĳɼ����ù���
//		SchoolReport sr= new SugarFouthGradeSchoolReport();
//		//���ɼ���
//		sr.report();
//		//Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
//		sr.sign("����"); //�ҽ�С�����ϰֵ�Ȼ������
		
		//�ɼ����ù���
		SchoolReport sr;
		sr = new FouthGradeSchoolReport(); //ԭװ�ĳɼ���
		//������߷�˵���ĳɼ���
		sr = new HighScoreDecorator(sr);
		//�ּ��˳ɼ�������˵��
		sr = new SortDecorator(sr);
		//���ɼ���
		sr.report();
		//Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
		sr.sign("����"); //�ҽ�С�����ϰֵ�Ȼ������
	}
}
