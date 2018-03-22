package com.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Предложение состоит из нескольких слов, разделенных пробелами.
 * Например: "One two three раз два три one1 two2 123 ".
 * Найти количество слов, содержащих только символы латинского алфавита.
 */

public class Part12 {
    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123 ";
        countLatin(str);
    }

    private static void countLatin(String str) {
        String stringPattern = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            i++;
            System.out.println(matcher.group());
        }
        System.out.println(i);
    }
}
