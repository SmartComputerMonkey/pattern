package com.designpatterns.facadepattern;

public class ModenPostOffice {
	
	private LetterProcess letterProcess = new LetterProcessImpl();
	
	//写信，封装，投递，一体化
	public void sendLetter(String context,String address) {
		
		//写
		letterProcess.writeContext(context);
		//写信封
		letterProcess.fillEnvelope(address);
		//把信放到信封中
		letterProcess.letterInotoEnvelope();
		//邮递信件
		letterProcess.sendLetter();
	}
}
