package com.lesson12;

/**
 * Напишите метод, заменяющий в строке все вхождения «object oriented programming»
 * (не учитываем регистр символов) на «OOP».
 */

public class part03 {
    public static void main(String[] args) {
        String s = "object oriented programming is difficult";
        Replacement(s);
    }

    private static void Replacement(String s) {
        System.out.println(s.replace("object oriented programming", "OOP"));
    }
}
