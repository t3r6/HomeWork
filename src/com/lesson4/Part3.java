package com.lesson4;

/**
 * Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        double i = Double.parseDouble(args[0]);
        double j = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);
        System.out.println("Среднее значение трех вещественных чисел = " + (i + j + a)/3);
    }
}

  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа (после ввода каждого нажмите Enter): ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int answer = (a + b + c) / 3;
            System.out.println("Среднее значение: " + answer);
        } else {
            System.out.println("Вы ввели не целое число"); //как сделать, чтобы работали дробные числа?
        }
    }*/


