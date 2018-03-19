package com.lesson12;

import java.util.Formatter;

/**
 * Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
 * Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию,
 * оценку и название предмета в качестве параметров.
 * Выделить под фамилию 15 символов, под оценку 3 символа, предмет – 10. (Задание с урока).
 */

public class part5 {
    public static void main(String[] args) {
        printString("Петров", 5, "физике");
        printString1("Иванов", 3, "математике");
    }

    public static void printString(String fullName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("%-15s получил оценку %3d по %10s", fullName, mark, subject);
        System.out.println(formatter);
    }
    public static void printString1(String fullName, int mark, String subject){
        System.out.printf("%-15s получил оценку %3d по %10s", fullName, mark, subject);
    }
}
