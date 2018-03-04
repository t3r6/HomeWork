package com.company.professions;

import java.util.Objects;

public class Person extends Driver {
    private int age;

    public Person(String name, int drivingExperience, int age) {
        super(name, drivingExperience);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), age);
    }

    public void printInfo() {
        System.out.println("Driver: " + this.getName());
        System.out.println("Driving experience: " + this.getDrivingExperience());
        System.out.println("Age; " + getAge());
        System.out.println();
    }

}
