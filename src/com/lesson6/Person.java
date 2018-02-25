package com.lesson6;

public class Person {
    String fullName;
    int age;

    Person(String n, int a) {
        fullName = n;
        age = a;
    }

    Person() {
    }

    void talk(String fullName) {
        System.out.println(fullName + " говорит");
    }

    void move(String fullName, int age) {
        System.out.println(fullName + " " + age + " еще двигается");
    }
}

