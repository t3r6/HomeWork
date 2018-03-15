package com.lesson09.part4and5;

/**
 * Создать классы для заполнения предыдущей таблицы.
 * Один и тот же класс
 */

public class Class1 {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.a = 10;
        class1.b = 20;
        class1.c = 30;
        class1.d = 40;

        System.out.println("a, b, с, d: " + class1.a + " " + class1.b + " " + class1.c + " " + class1.d);
    }
}
