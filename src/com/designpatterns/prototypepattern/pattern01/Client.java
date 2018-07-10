package com.designpatterns.prototypepattern.pattern01;

import java.util.Random;

/**
 *  原型模式先产生出一个包含大量共有信息的类，然后可以拷贝出副本，修正细节信息，建立了一个完
	整的个性对象。不知道大家有没有看过施瓦辛格演的《第六日》这个电影，电影的主线也就是一个人被复
	制，然后正本和副本对掐，我们今天讲的原型模式也就是由一个正本可以创建多个副本的概念，可以这样
	理解一个对象的产生可以不由零开始，直接从一个已经具备一定雏形的对象克隆，然后再修改为一个生产
	需要的对象。也就是说，产生一个人，可以不从1 岁 长到2 岁，再3 岁…，也可以直接找一个人，从其身
	上获得DNS，然后克隆一个，直接修改一下就是3 岁的了！，我们讲的原型模式也就是这样的功能，是紧跟
	时代潮流的。
 * @author Administrator
 *
 */

public class Client {

	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		// 把模板定义出来，这个是从数据库中获得
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		while (i < MAX_COUNT) {
			// 以下是每封邮件不同的地方
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// 然后发送邮件
			sendMail(mail);
			i++;
		}
	}

	// 发送邮件
	public static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t....发送成功！");
	}

	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
