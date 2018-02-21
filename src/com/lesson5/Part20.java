package com.lesson5;

/**
 * Изменить сортировку выбором - исключите обмен значений,
 * если найденный минимальный элемент уже находится на своем месте.
 */

public class Part20 {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}
