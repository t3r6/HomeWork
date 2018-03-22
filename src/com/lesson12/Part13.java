package com.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Предложение состоит из нескольких слов, например:
 * "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554".
 * Среди слов, состоящих только из цифр, найти слово-палиндром.
 */

public class Part13 {
    public static void main(String[] args) {
        System.out.println(palindrome("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554 1"));
    }

    public static String palindrome(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        StringBuilder s = new StringBuilder();
        while (matcher.find()) {
            s.append(matcher.group().equals(new StringBuilder(matcher.group()).reverse().toString())
                    ? matcher.group() + " " : "");
        }
        return s.toString();
    }
}
