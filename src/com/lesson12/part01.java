package com.lesson12;

/**
 * a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * б) Распечатать последний символ строки. Используем метод String.charAt().
 * в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * д) Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * е) Заменить все символы “а” на “о”.
 * ж) Преобразуйте строку к верхнему регистру.
 * з) Преобразуйте строку к нижнему регистру.
 * и) Вырезать строку Java c помощью метода String.substring. (Задание с урока).
 */

public class part01 {
    public static void main(String[] args) {
        lastChar("I like Java!!!");
        verifyString("I like Java!!!");
        verifyString("I hate Java");
        find("I like Java!!!");
        modifyString("I like Java!!!");
        System.out.println("I like Java!!!".substring(7, 11));
    }

    public static void lastChar(String str) {
        int len = str.length() - 1;
        System.out.println("Last character is: " + str.charAt(len));
    }

    public static void verifyString(String str) {
        System.out.println(str);
        System.out.println("Ends with: " + str.endsWith("!!!"));
        System.out.println("Starts with: " + str.startsWith("I like"));
        System.out.println("First character is: " + str.charAt(0));
        System.out.println("Last character is: " + str.charAt(str.length() - 1));
    }

    public static void find(String str) {
        System.out.println("Position of a substring: " + str.indexOf("Java"));
    }

    public static void modifyString(String str) {
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
