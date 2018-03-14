package com.lesson09.part4and5.package1;

import com.lesson09.part4and5.Class1;

/**
 * Создать классы для заполнения предыдущей таблицы.
 * Класс из другого пакета, не являющийся подклассом данного.
 */

public class SubClassInPackChild {
    public static void main(String[] args) {
        Class1 subClassInPackChild = new Class1();
       /* subClassInPackChild.a = 10; //private
        subClassInPackChild.b = 20; //default
        subClassInPackChild.c = 30;*/ //protected
        subClassInPackChild.d = 40; //public

        System.out.println("a, b, с, d: " + subClassInPackChild.getA() + " " + subClassInPackChild.getB() + " "
                + subClassInPackChild.getC() + " " + subClassInPackChild.d);
    }
}
