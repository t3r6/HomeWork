package com.lesson5;

/**
 * Переписать задание 3 используя switch. (Задание с урока.)
 */

public class Part4 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        switch (i) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Такого дня недели не существует");

        }
    }
}