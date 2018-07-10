package com.patterns.singleton.mysinglenton;

/**
 * 懒汉式单例模式
 */
public class People2 {

    public static  People2 people = null;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private People2() {
    }

    public static People2 getPeople(){
        if (people == null) {
            people = new People2();
        }
        return people;
    }
}
