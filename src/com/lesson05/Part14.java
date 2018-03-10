package com.lesson05;

/**
 * Добавить в программу ArrayInverterTest2 еще один тестовый массив.
 * Делаем дебаг и смотрим как работает. (Задание с урока).
 */

import java.util.Arrays;

public class Part14 {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
        testInvert(new int[]{10, 11, 12, 13, 14, 15});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }
}
