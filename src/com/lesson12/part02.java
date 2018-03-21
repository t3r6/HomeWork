package com.lesson12;

/**
 * а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 * б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * в) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace(). (Задание с урока).
 */

public class part02 {
    public static void main(String[] args) {
        calculate(3, 56);
        calculate1(4, 57);
    }

    private static void calculate(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        stringBuilder.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        System.out.println(stringBuilder);

        int pos = 0;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(pos, pos + 1, "равно");
        }
        System.out.println(stringBuilder);
    }

    public static void calculate1(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        stringBuilder.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        System.out.println(stringBuilder);

        int pos = 0;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " равно ");
        }
        System.out.println(stringBuilder);
    }
}





