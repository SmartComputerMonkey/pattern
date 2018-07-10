package com.patterns.singleton.mysinglenton;

public class People {
    public static final People people = new People();
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private People(){}

    public People getPeople() {
        return people;
    }
}
