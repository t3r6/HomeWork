package com.lesson6;

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
