package com.lesson04;

/**
 * Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */

public class Part3 {
    public static void main(String[] args) {
        double i = Double.parseDouble(args[0]);
        double j = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);
        System.out.println("Среднее значение трех вещественных чисел = " + (i + j + a)/3);
    }
}

