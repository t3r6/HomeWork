package com.lesson8.part4;

import java.util.Objects;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны
 * и... что-то на свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Orchids extends Flower {
    private String color4;

    public Orchids(String country, int storageLife, double price, String color4) {
        super(country, storageLife, price);
        this.color4 = color4;
    }

    public String getColor4() {
        return color4;
    }

    public void setColor4(String color4) {
        this.color4 = color4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Orchids orchids = (Orchids) o;
        return Objects.equals(color4, orchids.color4);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color4);
    }

    @Override
    public String toString() {
        return "Orchids{" +
                "color4='" + color4 + '\'' +
                '}';
    }
}
