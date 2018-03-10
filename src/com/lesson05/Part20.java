package com.lesson05;

/**
 * Изменить сортировку выбором - исключите обмен значений,
 * если найденный минимальный элемент уже находится на своем месте.
 */

public class Part20 {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;  //позиция мин элемента
            int min = array[i];  //значение самого элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            if (pos != i) {
                array[pos] = array[i];
                array[i] = min;
            }
        }
    }
}
