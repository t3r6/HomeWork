package com.lesson5;

/**
 * С помощью класса Scanner ввести целое число. Если это число от 0 до 10, вывести на консоль сообщение
 * “Положительное число меньше 10”, иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 * Используем оператор if-else. (Задание с урока.)
 */

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i >= 0 && i < 10) {
                System.out.println("Положительное число меньше 10");
            } else if (i == 10) {
                System.out.println("Положительное число равно 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
