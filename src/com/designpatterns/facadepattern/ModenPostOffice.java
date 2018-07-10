package com.designpatterns.facadepattern;

public class ModenPostOffice {
	
	private LetterProcess letterProcess = new LetterProcessImpl();
	
	//д�ţ���װ��Ͷ�ݣ�һ�廯
	public void sendLetter(String context,String address) {
		
		//д
		letterProcess.writeContext(context);
		//д�ŷ�
		letterProcess.fillEnvelope(address);
		//���ŷŵ��ŷ���
		letterProcess.letterInotoEnvelope();
		//�ʵ��ż�
		letterProcess.sendLetter();
	}
}
