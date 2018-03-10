package com.lesson07;

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

    void talk(String fullName) {
        System.out.println(fullName + " говорит");
    }

    void move(String fullName, int age) {
        System.out.println(fullName + " " + age + " еще двигается");
    }
}

