package com.designpatterns.visitorpattern.pattern04;

public class ShowVisitor implements IShowVisitor {

	private String info = "";
	
	
	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.info = this.info + this.getBasicInfo(commonEmployee)+ "������commonEmployee.getJob()"+"\t\n";
	}

	@Override
	public void visit(Manager manager) {
		this.info = this.info + this.getBasicInfo(manager) + "ҵ����manager.getPerformance()"+"\t\n";
	}

	private String getBasicInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�" + (employee.getSex() == Employee.FEMALE ? "Ů" : "��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}
	
	@Override
	public void report() {
		System.out.println(this.info);
	}

}
