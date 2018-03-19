package com.lesson07;

import java.util.Objects;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 * другой - Person(fullName, age).
 */

public class Person {
    String fullName;
    int age;

    Person(String n, int a) {
        fullName = n;
        age = a;
    }

    Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void talk(String fullName) {
        System.out.println(fullName + " говорит");
    }

    void move(String fullName, int age) {
        System.out.println(fullName + " " + age + " еще двигается");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, age);
    }

    @Override
    public String toString() {
        return String.format("Person{fullName='%s', age='%d'}" ,fullName , age);
    }
}

