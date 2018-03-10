package com.lesson08.part4;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны
 * и... что-то на свой вкус).  Собрать 3 букета (используем массив) с определением их стоимости.
 * В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Bouquet {
    public static void main(String[] args) {
        Roses r1 = new Roses("Ukraine", 7, 21.50, "red");
        Roses r2 = new Roses("Holland", 7, 22.50, "yellow");
        Roses r3 = new Roses("Russia", 7, 19.00, "white");
        Carnations c1 = new Carnations("France", 6, 8.90, "pink");
        Carnations c2 = new Carnations("Ukraine", 6, 7.50, "yellow");
        Carnations c3 = new Carnations("Germany", 9, 12.90, "purple");
        Tulips t1 = new Tulips("Ukraine", 5, 9.40, "yellow");
        Tulips t2 = new Tulips("Holland", 8, 15.50, "red");
        Tulips t3 = new Tulips("Italy", 7, 13.40, "yellow");
        Orchids o1 = new Orchids("Ukraine", 8, 16.30, "pink");
        Orchids o2 = new Orchids("Russia", 9, 18.00, "white");
        Orchids o3 = new Orchids("USA", 12, 20.50, "blue");

        Flower[] bouquet1 = {r1, r2, r3, o1, o3, t2};
        Flower[] bouquet2 = {t1, t2, t3, c3, r1};
        Flower[] bouquet3 = {r1, c2, t3, o2, r2, c1};

        Flower.totalPrice(bouquet1);
        Flower.totalPrice(bouquet2);
        Flower.totalPrice(bouquet3);
        System.out.println();

        System.out.println("Количество разновидностей цветов: " + Flower.getCount());
        Flower.setCount(bouquet1.length + bouquet2.length + bouquet3.length);
        System.out.println("Продано цветов в букетах: " + Flower.getCount());
    }
}
