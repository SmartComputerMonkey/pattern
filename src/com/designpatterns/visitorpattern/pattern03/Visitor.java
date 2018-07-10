package com.designpatterns.visitorpattern.pattern03;


public class Visitor implements IVisitor {

	//���ž���Ĺ���ϵ����5
	private final static int MANAGER_COEFFICIENT = 5;
	//Ա���Ĺ���ϵ����2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	//��ͨԱ���Ĺ����ܺ�
	private int commonTotalSalary = 0;
	//���ž���Ĺ����ܺ�
	private int managerTotalSalary =0;
	
	private String getBasicInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�" + (employee.getSex() == Employee.FEMALE ? "Ů" : "��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}
	
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "ҵ����"+manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}
	
	private String getCommonEmployee(CommonEmployee commonEmployee){
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "������"+commonEmployee.getJob()+"\t";
		return basicInfo + otherInfo;
	}
	
	private void calManagerSalary(int salary){
		this.managerTotalSalary = this.managerTotalSalary + salary
		*MANAGER_COEFFICIENT ;
	}
	
	private void calCommonSlary(int salary){
		this.commonTotalSalary = this.commonTotalSalary +
		salary*COMMONEMPLOYEE_COEFFICIENT;
	}
	
	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
		this.calCommonSlary(commonEmployee.getSalary());

	}

	
	
	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
		this.calManagerSalary(manager.getSalary());
	}

	@Override
	public int getTotalSalary() {
		return this.commonTotalSalary + this.managerTotalSalary;
	}

}
