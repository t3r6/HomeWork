package com.lesson5;

/**
 * Создать массив типа String с размером 7. Записать в него значения дней недели.
 * Вывести на консоль значение последнего элемента. (Задание с урока).
 */

public class Part10 {
    public static void main(String[] args) {
        String[] day = new String[7];
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";
        System.out.println("The last day is: " + day[6]);
    }
}
