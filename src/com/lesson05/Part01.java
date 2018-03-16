package com.lesson05;

/**
 * Передать на вход программы число в качестве аргумента. Если оно нечетное, распечатать его.
 * Используем оператор if. Используйте метод Integer.parseInt() для преобразования из String в int. (Задание с урока.)
 */

public class Part01 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i % 2 != 0) {
            System.out.println("Число " + i + " нечетное");
        }
    }
}
