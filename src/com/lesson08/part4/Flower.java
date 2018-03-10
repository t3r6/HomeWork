package com.lesson08.part4;

import java.text.*;
import java.util.Objects;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны
 * и... что-то на свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Flower {
    private static int count;
    private String country;
    private int storageLife;
    private double price;

    public Flower(String country, int storageLife, double price) {
        this.country = country;
        this.storageLife = storageLife;
        this.price = price;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(int storageLife) {
        this.storageLife = storageLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return storageLife == flower.storageLife &&
                Double.compare(flower.price, price) == 0 &&
                Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country, storageLife, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", storageLife=" + storageLife +
                ", price=" + price +
                '}';
    }

    public static void totalPrice(Flower[] bouquet) {
        double price = 0;
        for (int i = 0; i < bouquet.length; i++) {
            price += bouquet[i].getPrice();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Bouquet Price: " + df.format(price));
    }
}
