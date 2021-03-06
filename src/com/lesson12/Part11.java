package com.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найти слово, в котором число различных символов минимально.
 * Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 * Например в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class Part11 {
    public static void main(String[] args) {
        String str = "fffff ab f 1234 jkjk";
        System.out.print("Заданная строка: " + str + "\nСлово с минимальным количеством различных символов: ");
        minChars(str);
    }

    private static void minChars(String str) {
        String min = null;
        StringBuilder s = new StringBuilder();
        int ch1, ch2 = str.length();
        for (String word : str.split(" ")) {
            ch1 = 0;
            s.setLength(0);
            for (int i = 0; i < str.length() - 1; i++) {
                if (s.indexOf(String.valueOf(word.charAt(i))) == -1) {
                    s.append(word.charAt(i));
                    ch1++;
                }
            }
            if (ch1 < ch2) {
                ch2 = ch1;
                min = word;
            }
        }
        System.out.println(min);
    }
}
