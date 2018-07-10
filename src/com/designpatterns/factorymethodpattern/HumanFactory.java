package com.designpatterns.factorymethodpattern;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.designpatterns.utils.ClassUtils;

public class HumanFactory {
	
	private static HashMap<String,Human> humans = new HashMap<String,Human>();
	
	public static Human createHuman(Class c) {
		
		Human human = null;
		
		try {
			if (humans.containsKey(c.getSimpleName())) {
				human = humans.get(c.getSimpleName());
			} else {
				human = (Human) Class.forName(c.getName()).newInstance();
				humans.put(c.getSimpleName(), human);
			}
		} catch (InstantiationException e) {
			System.out.println("必须指定人种的颜色");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("人种定义错误");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("混蛋，你指定的人种找不到！");
			e.printStackTrace();
		}
		return human;
	}
	
	public static Human createHuman() {
		
		Human human = null;
		List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
		
		Random random = new Random();
		
		int rand = random.nextInt(concreteHumanList.size());
		human = createHuman(concreteHumanList.get(rand));
		
		return human;
	}
}
