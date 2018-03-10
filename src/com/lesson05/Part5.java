package com.lesson05;

/**
 * Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while. (Задание с урока.)
 */

public class Part5 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println("Task" + i--);
        }
    }
}
