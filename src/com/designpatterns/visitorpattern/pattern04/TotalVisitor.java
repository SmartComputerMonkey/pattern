package com.designpatterns.visitorpattern.pattern04;

public class TotalVisitor implements ITotalVisitor {

	// ���ž���Ĺ���ϵ����5
	private final static int MANAGER_COEFFICIENT = 5;
	// Ա���Ĺ���ϵ����2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	// ��ͨԱ���Ĺ����ܺ�
	private int commonTotalSalary = 0;
	// ���ž���Ĺ����ܺ�
	private int managerTotalSalary = 0;

	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
	}

	@Override
	public void visit(Manager manager) {
		this.managerTotalSalary = this.managerTotalSalary + manager.getSalary() * MANAGER_COEFFICIENT;
	}

	@Override
	public void totalSalary() {
		System.out.println("����˾���¹����ܶ���" + (this.commonTotalSalary + this.managerTotalSalary));
	}

}
