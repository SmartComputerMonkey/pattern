package com.designpatterns.decoratorpattern;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

	private void reportHighScore() {
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}
	
	private void reportSort(){
		System.out.println("����������38��...");
	}
	
	public void report() {
		this.reportHighScore(); //��˵��߳ɼ�
		super.report(); //Ȼ���ϰֿ��ɼ���
		this.reportSort(); //Ȼ������ϰ�ѧϰѧУ����
	}
}
