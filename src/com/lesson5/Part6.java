package com.lesson5;

/**
 * Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.(Задание с урока.)
 */

public class Part6 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i++);
        } while (i <= 100 && i % 5 == 0);
    }
}
