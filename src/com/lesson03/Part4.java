package com.lesson03;

/**
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа (после ввода каждого нажмите Enter): ");
        System.out.println("Сумма a + b = " + sum(sc));
    }

    private static int check(Scanner sc) {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
            return 0;
        }
    }

    private static int sum(Scanner sc) {
        int a = check(sc);
        int b = check(sc);
        return a + b;
    }
}

