package com.lesson09.part4and5;

/**
 * Создать классы для заполнения предыдущей таблицы.
 * Подкласс, находящийся в том же пакете, что и суперкласс
 */

public class Class1Child extends Class1 {
    public static void main(String[] args) {
        Class1Child class1Child = new Class1Child();
        /*class1Child.a = 10;*/ // No access
        class1Child.getA(); //using getter instead
        class1Child.b = 20;
        class1Child.c = 30;
        class1Child.d = 40;

        System.out.println("a, b, с, d: " + class1Child.getA() + " " + class1Child.b + " " + class1Child.c + " "
                + class1Child.d);
    }
}
