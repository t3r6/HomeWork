package com.lesson12;

/**
 * Даны строки разной длины (длина - четное число),
 * необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */

public class Part04 {
    public static void main(String[] args) {
        String[] str = {"string", "code", "Practice"};

        for (String string : str) {
            System.out.println(getMiddleLetters(string));
        }
    }

    public static String getMiddleLetters(String s) {
        return s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
    }


}
