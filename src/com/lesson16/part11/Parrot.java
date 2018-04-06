package com.lesson16.part11;

import java.util.Objects;

/**
 * Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 * а в качестве значения класс Pet. Добавьте в отображение разных животных.
 * Создайте метод выводящий на консоль все все ключи отображения.
 */

public class Parrot extends Pet{
    private String origin;

    public Parrot(String name, int age, String origin) {
        super(name, age);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(origin, parrot.origin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), origin);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "origin='" + origin + '\'' +
                '}';
    }
}
