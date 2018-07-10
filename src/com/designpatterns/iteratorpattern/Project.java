package com.designpatterns.iteratorpattern;

import java.util.ArrayList;

public class Project implements IProject {

	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	
	private String name = "";
	
	private int num = 0;
	
	private int cost = 0;
	
	public Project(){
		
	}
	
	public Project (String name,int num,int cost) {
		this.name = name;
		this.num = num;
		this.cost = cost;
	}
	
	@Override
	public String getProjectInfo() {
		String info = "";
		//�����Ŀ������
		info = info+ "��Ŀ�����ǣ�" + this.name;
		//�����Ŀ����
		info = info + "\t��Ŀ����: "+ this.num;
		//��Ŀ����
		info = info+ "\t ��Ŀ���ã�"+ this.cost;
		return info;
	}

	@Override
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name,num,cost));
	}

	@Override
	public IProjectIterator iterator() {
		// TODO Auto-generated method stub
		return new ProjectIterator(this.projectList);
	}

}
