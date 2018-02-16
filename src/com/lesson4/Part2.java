package com.lesson4;

/**
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 */

public class Part2 {
    public static void main(String[] args) {
        invert();
        blinking();
        condition();
    }

    private static void invert() {
        int a = 55;
        for (int i = 0; i < 5; i++) {
            a = ~a;
            System.out.println("Состояние инвертированной гирлянды: " + Integer.toBinaryString(a));
        }
    }

    private static void condition() {
        int i = 5;
        int mask = 1;
        int c = i & mask;
        System.out.println("Включена ли первая лампочка: " + Integer.toBinaryString(c));
        System.out.println("Текущее состояние гирлянды: " + Integer.toBinaryString(i));
    }

    private static void blinking() {
        int b = 55;
        for (int i = 0; i < 5; i++) {
            b = b << 1;
            System.out.println("Мигающая гирлянда: " + Integer.toBinaryString(b));
        }
    }


}
