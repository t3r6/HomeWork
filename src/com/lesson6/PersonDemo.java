package com.lesson6;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 * другой - Person(fullName, age).
 */

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Антон Е.А.", 53);

        System.out.println("ФИО " + person1.fullName + " возраст " + person1.age);
        System.out.println("ФИО " + person2.fullName + " возраст " + person2.age);
        System.out.println();
        person2.talk(person2.fullName);
        person2.move(person2.fullName, person2.age);
    }
}
