package com.lesson09.part4and5;

/**
 * Создать классы для заполнения предыдущей таблицы.
 * Класс из того же самого пакета, не являющийся подклассом.
 */

public class Class2 {
    public static void main(String[] args) {
        Class1 class2 = new Class1();
        /*class2.a = 10;*/ // No access
        class2.b = 20;
        class2.c = 30;
        class2.d = 40;

        System.out.println("a, b, с, d: " + class2.getA() + " " + class2.b + " " + class2.c + " "
                + class2.d);
    }
}
