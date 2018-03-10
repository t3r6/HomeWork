package com.lesson08.part5;

import java.util.Objects;

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

public class Horse extends Animal{
    private String breed3;

    public Horse(String name, String food, String location, String breed3) {
        super(name, food, location);
        this.breed3 = breed3;
    }

    public String getBreed3() {
        return breed3;
    }

    public void setBreed3(String breed3) {
        this.breed3 = breed3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(breed3, horse.breed3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), breed3);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed3='" + breed3 + '\'' +
                '}';
    }
    public void makeNoise() {
        System.out.println("Horse is making Neigh sound");
    }

    public void eat() {
        System.out.println("Horse is eating");
    }

    public void sleep() {
        System.out.println("Horse is sleeping");
    }
}
