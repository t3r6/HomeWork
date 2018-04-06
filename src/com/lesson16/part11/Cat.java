package com.lesson16.part11;

import java.util.Objects;

/**
 * Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 * а в качестве значения класс Pet. Добавьте в отображение разных животных.
 * Создайте метод выводящий на консоль все все ключи отображения.
 */

public class Cat extends Pet{
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
