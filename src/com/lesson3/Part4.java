package com.lesson3;

/**
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа (после ввода каждого нажмите Enter): ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Сумма a + b = " + (a + b));
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
