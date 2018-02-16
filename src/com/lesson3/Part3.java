package com.lesson3;

import java.util.Scanner;

/**
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i % 2 == 0) {
                System.out.print("Вы ввели четное число");
            } else {
                System.out.print("Вы ввели нечетное число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
