package com.lesson02;

/**
 * Создать программу, в которой вывести на консоль литералы следующих видов:
       * а) логический литерал
       * б) строковый
       * в) символьный
       * г) целочисленный 2-й
       * д) целочисленный 8-й
       * е) целочисленный 10-й
       * ж) целочисленный 16-й
       * з) литерал типа float
       * е) литерал типа double.(Задание с урока)
 */

public class Part4 {
    public static void main(String[] args) {
        logic1();
        string1();
        char1();
        int2();
        int8();
        int10();
        int16();
        float1();
        double1();
    }

    private static void logic1() {
        boolean x = true;
        System.out.println(x);
    }

    private static void string1() {
        String a = "Hello";
        System.out.println(a);
    }

    private static void char1() {
        char b = 't';
        System.out.println(b);
    }

    private static void int2() {
        int c = 0b101;
        System.out.println(c);
    }

    private static void int8() {
        int d = 010;
        System.out.println(d);
    }

    private static void int10() {
        int e = 878;
        System.out.println(e);
    }

    private static void int16() {
        int f = 0x7ddfffff;
        System.out.println(f);
    }

    private static void float1() {
        float g = 4.56f;
        System.out.println(g);
    }

    private static void double1() {
        double h = 4.56;
        System.out.println(h);
    }
}

