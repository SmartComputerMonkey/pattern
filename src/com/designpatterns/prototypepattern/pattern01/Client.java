package com.designpatterns.prototypepattern.pattern01;

import java.util.Random;

/**
 *  ԭ��ģʽ�Ȳ�����һ����������������Ϣ���࣬Ȼ����Կ���������������ϸ����Ϣ��������һ����
	���ĸ��Զ��󡣲�֪�������û�п���ʩ�������ݵġ������ա������Ӱ����Ӱ������Ҳ����һ���˱���
	�ƣ�Ȼ�������͸������������ǽ��콲��ԭ��ģʽҲ������һ���������Դ�����������ĸ����������
	���һ������Ĳ������Բ����㿪ʼ��ֱ�Ӵ�һ���Ѿ��߱�һ�����εĶ����¡��Ȼ�����޸�Ϊһ������
	��Ҫ�Ķ���Ҳ����˵������һ���ˣ����Բ���1 �� ����2 �꣬��3 �ꡭ��Ҳ����ֱ����һ���ˣ�������
	�ϻ��DNS��Ȼ���¡һ����ֱ���޸�һ�¾���3 ����ˣ������ǽ���ԭ��ģʽҲ���������Ĺ��ܣ��ǽ���
	ʱ�������ġ�
 * @author Administrator
 *
 */

public class Client {

	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// ģ�ⷢ���ʼ�
		int i = 0;
		// ��ģ�嶨�����������Ǵ����ݿ��л��
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX���а�Ȩ����");
		while (i < MAX_COUNT) {
			// ������ÿ���ʼ���ͬ�ĵط�
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + " ������Ůʿ��");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			// Ȼ�����ʼ�
			sendMail(mail);
			i++;
		}
	}

	// �����ʼ�
	public static void sendMail(Mail mail) {
		System.out.println("���⣺" + mail.getSubject() + "\t�ռ��ˣ�" + mail.getReceiver() + "\t....���ͳɹ���");
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
