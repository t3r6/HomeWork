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

    void print1() {
        System.out.println(a);
    }

    void print2() {
        System.out.println(b);
    }

    void print3() {
        System.out.println(c);
    }

    void print4() {
        System.out.println(d);
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.a = 10;
        class1.b = 20;
        class1.c = 30;
        class1.d = 40;

        class1.print1();
        class1.print2();
        class1.print3();
        class1.print4();
        System.out.println ("a, b, с, d: " + class1.a + " " + class1.b + " " + class1.c + " " + class1.d);
    }
}
