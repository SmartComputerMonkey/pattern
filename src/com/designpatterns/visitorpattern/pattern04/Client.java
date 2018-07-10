package com.designpatterns.visitorpattern.pattern04;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		IShowVisitor showVisitor = new ShowVisitor();
		ITotalVisitor totalVisitor = new TotalVisitor();
		for (Employee emp : mockEmployee()) {
			emp.accept(showVisitor);
			emp.accept(totalVisitor);
		}
		showVisitor.report();
		totalVisitor.totalSalary();
	}
	
	public static List<Employee> mockEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		//�����������Ա��
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob("��дJava���򣬾��Ե����졢�๤�Ӱ��˹�");
		zhangSan.setName("����");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		empList.add(zhangSan);
		
		//�����������Ա��
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("ҳ����������������̫�������ˣ�");
		liSi.setName("����");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		empList.add(liSi);
		
		//�ٲ���һ������
		Manager wangWu = new Manager();
		wangWu.setName("����");
		wangWu.setPerformance("�������Ǹ�ֵ�������һ�����ƨѽ");
		wangWu.setSalary(18750);
		wangWu.setSex(Employee.MALE);
		empList.add(wangWu);
		return empList;
	}
}
