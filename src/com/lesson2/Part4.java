package com.lesson2;

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
        Logic();
        String();
        Char();
        Int2();
        Int8();
        Int10();
        Int16();
        Float();
        Double();
    }

    public static void Logic() {
        boolean x = true;
        System.out.println(x);
    }

    public static void String() {
        String a = "Hello";
        System.out.println(a);
    }

    public static void Char() {
        char b = 't';
        System.out.println(b);
    }

    public static void Int2() {
        int c = 0b101;
        System.out.println(c);
    }

    public static void Int8() {
        int d = 010;
        System.out.println(d);
    }

    public static void Int10() {
        int e = 878;
        System.out.println(e);
    }

    public static void Int16() {
        int f = 0x7ddfffff;
        System.out.println(f);
    }

    public static void Float() {
        float g = 4.56f;
        System.out.println(g);
    }

    public static void Double() {
        double h = 4.56;
        System.out.println(h);
    }
}

