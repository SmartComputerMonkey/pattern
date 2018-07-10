package com.patterns.singleton.mysinglenton;

/**
 * 线程安全的单例模式
 */
public class People3 {
    public static People3 people3 = null;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private People3() {
    }

    public synchronized People3 getPeople3(){
        if (people3 == null) {
            people3 = new People3();
        }
        return people3;
    }
}
