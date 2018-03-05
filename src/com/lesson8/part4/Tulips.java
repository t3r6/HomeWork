package com.lesson8.part4;

import java.util.Objects;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны
 * и... что-то на свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Tulips extends Flower {
    private String color3;

    public Tulips(String country, int storageLife, double price, String color3) {
        super(country, storageLife, price);
        this.color3 = color3;
    }

    public String getColor3() {
        return color3;
    }

    public void setColor3(String color3) {
        this.color3 = color3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tulips tulips = (Tulips) o;
        return Objects.equals(color3, tulips.color3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color3);
    }

    @Override
    public String toString() {
        return "Tulips{" +
                "color3='" + color3 + '\'' +
                '}';
    }
}
