package com.designpatterns.iteratorpattern;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {

	//���е���Ŀ����������ArrayList��
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	
	private int currenItem = 0;
	
	public ProjectIterator(ArrayList<IProject> projectList) {
		
		this.projectList = projectList;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if (this.currenItem >= projectList.size() ||
				this.projectList.get(this.currenItem) == null) {
			b = false;
		}
		return b;
	}

	@Override
	public Object next() {
		return this.projectList.get(this.currenItem++);
	}

}
