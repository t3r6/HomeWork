package com.lesson13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;

/**
 * Создайте объект класса Calendar, указывая дату своего рождения.
 * Вывести на консоль день недели, неделя в году, день в году, количество прожитых миллисекунд.
 * Вывести дату своего дня рождения на консоль используя разные стили SHORT, FULL, MEDIUM,  LONG. (Задание с урока).
 */

public class Part2 {
    public static void main(String[] args) {
        Calendar calendar1 = new GregorianCalendar(1988, 11, 17);
        System.out.println("День недели в месяце: " + calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("День недели: " + calendar1.get(Calendar.DAY_OF_WEEK));
        System.out.println("День месяца: " + calendar1.get(Calendar.DAY_OF_MONTH));
        System.out.println("День в году: " + calendar1.get(Calendar.DAY_OF_YEAR));
        System.out.println("Неделя в году: " + calendar1.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Количество прожитых миллисекунд: " + calendar1.getTimeInMillis());
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(calendar1.getTime()));
        System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM).format(calendar1.getTime()));
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(calendar1.getTime()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(calendar1.getTime()));
    }
}