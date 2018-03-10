package com.lesson08.part5;

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

public class Cat extends Animal{
    private String breed2;

    public Cat(String name, String food, String location, String breed2) {
        super(name, food, location);
        this.breed2 = breed2;
    }

    public String getBreed2() {
        return breed2;
    }

    public void setBreed2(String breed2) {
        this.breed2 = breed2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed2, cat.breed2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), breed2);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed2='" + breed2 + '\'' +
                '}';
    }
    public void makeNoise() {
        System.out.println("Cat is making Meow sound");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
