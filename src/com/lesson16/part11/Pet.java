package com.lesson16.part11;

import java.util.Objects;

/**
 * Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 * а в качестве значения класс Pet. Добавьте в отображение разных животных.
 * Создайте метод выводящий на консоль все все ключи отображения.
 */

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Pet pet = (Pet) o;
        return age == pet.age &&
                Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
