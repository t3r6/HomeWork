package com.lesson08.part4;

import java.util.Objects;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны
 * и... что-то на свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Roses extends Flower {
    private String color1;

    public Roses(String country, int storageLife, double price, String color1) {
        super(country, storageLife, price);
        this.color1 = color1;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Roses roses = (Roses) o;
        return Objects.equals(color1, roses.color1);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color1);
    }

    @Override
    public String toString() {
        return "Roses{" +
                "color1='" + color1 + '\'' +
                '}';
    }
}
