package com.lesson4;

/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа (после ввода каждого нажмите Enter): ");
            int a = check(sc);
            int b = check(sc);
            int c = check(sc);
            int i = a < 0 ? -a : a;
            int j = b < 0 ? -b : b;
            int n = c < 0 ? -c : c;
            int answer = Math.min(Math.min(i, j), n);
            System.out.println("Меньшее по модулю число: " +answer);
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
}
