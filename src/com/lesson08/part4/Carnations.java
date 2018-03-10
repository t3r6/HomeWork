package com.lesson08.part4;

import java.util.Objects;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны
 * и... что-то на свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Carnations extends Flower {
    private String color2;

    public Carnations(String country, int storageLife, double price, String color2) {
        super(country, storageLife, price);
        this.color2 = color2;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnations that = (Carnations) o;
        return Objects.equals(color2, that.color2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color2);
    }

    @Override
    public String toString() {
        return "Carnations{" +
                "color2='" + color2 + '\'' +
                '}';
    }
}
