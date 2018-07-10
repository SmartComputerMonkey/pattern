package com.patterns.singleton.mysinglenton;

/**
 * À´÷ÿ»œ÷§
 */
public class People4 {
    public static People4 people;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private People4() {
    }

    public synchronized People4 getPeople(){
        if (people == null) {
            synchronized(People4.class) {
                if (people == null) {
                    people = new People4();
                }
            }
        }
        return people;
    }

}
