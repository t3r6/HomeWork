package com.lesson15;

/**
 * Написать класс Калькулятор (необобщенный),
 * который содержит обобщенные статические методы - sum, multiply, divide, subtraction.
 * Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.
 */

public class Calculator {
    public static <T extends Number, V extends Number> void add(T n1, V n2) {
        System.out.println(n1.doubleValue() + n2.doubleValue());
    }

    public static <T extends Number, V extends Number> void subtract(T n1, V n2) {
        System.out.println(n1.doubleValue() - n2.doubleValue());
    }

    public static <T extends Number, V extends Number> void multiply(T n1, V n2) {
        System.out.println(n1.doubleValue() * n2.doubleValue());
    }

    public static <T extends Number, V extends Number> void divide(T n1, V n2) {
        System.out.println(n1.doubleValue() / n2.doubleValue());
    }

    public static void main(String[] args) {
        double x = 6;
        double y = 2.3;
        add(x, y);
        subtract(x, y);
        multiply(x, y);
        divide(x, y);
    }
}
