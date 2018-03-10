package com.lesson05;

import java.util.Arrays;

/**
 * Реализовать задачу с гирляндой используя массивы.
 * Для реализации бегущей строки используйте метод System.arraycopy(...);
 */

public class Part18 {
    public static void main(String[] args) {
        int[] garland = new int[32];
        for (int i = 0; i < garland.length; i++) {
            garland[i] = (int) (Math.round(Math.random()));
        }
        checkTheFirst(garland[0]);
        System.out.println("Текущее состояние гирлянды:");
        System.out.println(Arrays.toString(garland));
        System.out.println("Мигание гирлянды:");
        blinking(garland);
        System.out.println("Бегущая строка:");
        crawler(garland);
    }

    private static void checkTheFirst(int i) {
        if (i == 1) {
            System.out.println("Лампочка включена");
        } else {
            System.out.println("Лампочка выключена");
        }
    }

    private static void blinking(int[] garland) {
        for (int j = 0; j < garland.length; j++) {
            if (garland[j] == 1) {
                garland[j] = 0;
            } else {
                garland[j] = 1;
            }
        }
        System.out.println(Arrays.toString(garland));
    }

    private static void crawler(int[] garland) {
        for (int i = 0; i < 5; i++) {
            System.arraycopy(garland, 0, garland, 1, garland.length - 1);
            System.out.println(Arrays.toString(garland));
        }
    }
}
