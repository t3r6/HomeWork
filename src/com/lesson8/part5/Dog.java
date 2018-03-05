package com.lesson8.part5;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
 * Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
 * Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару.
 */

import java.util.Objects;

public class Dog extends Animal{
    private String breed1;

    public Dog(String name, String food, String location, String breed1) {
        super(name, food, location);
        this.breed1 = breed1;
    }

    public String getBreed1() {
        return breed1;
    }

    public void setBreed1(String breed1) {
        this.breed1 = breed1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed1, dog.breed1);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), breed1);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed1='" + breed1 + '\'' +
                '}';
    }

    public void makeNoise() {
        System.out.println("Dog is Barking");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
