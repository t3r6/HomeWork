package com.lesson09.part4and5.package1;

import com.lesson09.part4and5.Class1;

/**
 * Создать классы для заполнения предыдущей таблицы.
 * Подкласс, находящийся в другом пакете.
 */

public class SubClassInPackage extends Class1 {
    public static void main(String[] args) {
        SubClassInPackage subClassInPackage = (SubClassInPackage) new Class1();
        /*subClassInPackage.a = 10; //private
        subClassInPackage.b = 20;*/ //default
        subClassInPackage.c = 30;
        subClassInPackage.d = 40;

        System.out.println("a, b, с, d: " + subClassInPackage.getA() + " " + subClassInPackage.getB() + " " + subClassInPackage.c + " "
                + subClassInPackage.d);
    }
}
