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
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int i = a < 0 ? -a : a;
            int j = b < 0 ? -b : b;
            int n = c < 0 ? -c : c;
            int answer = Math.min(Math.min(i, j), n);
            System.out.println("Меньшее по модулю число: " +answer);
        } else {
            System.out.println("Вы ввели не целое число"); //эта часть не работает
        }
    }
}
