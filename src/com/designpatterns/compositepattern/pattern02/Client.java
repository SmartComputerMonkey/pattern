package com.designpatterns.compositepattern.pattern02;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		//��������װһ����֯�ṹ����
		Branch ceo = compositeCorpTree();
		//���Ȱ�CEO����Ϣ��ӡ������
		System.out.println(ceo.getInfo());
		//Ȼ��������Ա����Ϣ
		System.out.println(getTreeInfo(ceo));
	}

	public static Branch compositeCorpTree() {
		// ���Ȳ����ܾ���CEO
		Branch root = new Branch("��������", "�ܾ���", 100000);
		// ���������ž����������
		Branch developDep = new Branch("����ȳ��", "�з����ž���", 10000);
		Branch salesDep = new Branch("�������", "���۲��ž���", 20000);
		Branch financeDep = new Branch("��������", "���񲿾���", 30000);

		// �ٰ�����С�鳤��������
		Branch firstDevGroup = new Branch("����ؿб", "����һ���鳤", 5000);
		Branch secondDevGroup = new Branch("�����", "���������鳤", 6000);

		// �����е�С������������
		Leaf a = new Leaf("a", "������Ա", 2000);
		Leaf b = new Leaf("b", "������Ա", 2000);
		Leaf c = new Leaf("c", "������Ա", 2000);
		Leaf d = new Leaf("d", "������Ա", 2000);
		Leaf e = new Leaf("e", "������Ա", 2000);
		Leaf f = new Leaf("f", "������Ա", 2000);
		Leaf g = new Leaf("g", "������Ա", 2000);
		Leaf h = new Leaf("h", "������Ա", 5000);
		Leaf i = new Leaf("i", "������Ա", 4000);
		Leaf j = new Leaf("j", "������Ա", 5000);
		Leaf k = new Leaf("k", "CEO����", 8000);
		Leaf zhengLaoLiu = new Leaf("֣����", "�з���������", 20000);

		// ��ʼ��װ
		// CEO�����������ž����һ������
		root.add(k);
		root.add(developDep);
		root.add(salesDep);
		root.add(financeDep);

		// �з�������
		developDep.add(zhengLaoLiu);
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);

		// ����������������С������ʲô
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		secondDevGroup.add(d);
		secondDevGroup.add(e);
		secondDevGroup.add(f);

		// �ٿ����۲��µ���Ա���
		salesDep.add(h);
		salesDep.add(i);
		// ���һ������
		financeDep.add(j);
		return root;
	}

	// ����������,ֻҪ���Ҹ��ڵ㣬�Ҿ��ܱ��������еĽڵ�
	public static String getTreeInfo(Branch root) {
		ArrayList<IGorp> subordinateList = root.getSubordinateInfo();
		String info = "";
		for (IGorp s : subordinateList) {
			if (s instanceof Leaf) { // ��Ա����ֱ�ӻ����Ϣ
				info = info + s.getInfo() + "\n";
			} else { // �Ǹ�СͷĿ
				info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
			}
		}
		return info;
	}

}
