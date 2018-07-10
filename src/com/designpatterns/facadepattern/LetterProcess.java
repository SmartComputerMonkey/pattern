package com.designpatterns.facadepattern;

public interface LetterProcess {
	
	//д�ŵ�����
	public void writeContext(String context);
	
	//д�ŷ�
	public void fillEnvelope(String address);
	
	//���ŷŵ��ŷ���
	public void letterInotoEnvelope();
	
	//�ʵ�
	public void sendLetter();
}
