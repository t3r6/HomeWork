package com.lesson5;

/**
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for. (Задание с урока.)
 */

public class Part7 {
    public static void main(String[] args) {
        char c = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(c++ + " ");
        }
    }
}
