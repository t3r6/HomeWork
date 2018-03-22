package com.lesson13;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Создать properties файлы на русском и английским, содержащие названия изученных тем по Java.
 * Создать метод, который получает в качестве параметра локаль и распечатывает всю информацию из properties файла.
 * Используем метод ResourceBundle.keySet(). (Задание с урока).
 */

public class Part1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");
        printInfo("en", "US");
        printInfo("ru", "RU");
    }

    private static void printInfo(String language, String country)
            throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("topic", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}
