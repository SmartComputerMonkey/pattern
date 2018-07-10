package com.patterns.singleton.mysinglenton;

public class TestMain {

    public static void main(String[] args) {
        People people = People.people;
        People people1 = People.people;
        people.setName("test1");
        people1.setName("test2");
        System.out.println(people.getName());
        System.out.println(people1.getName());
    }
}
