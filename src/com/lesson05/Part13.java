package com.lesson05;

/**
 * Создать двумерный массив типа char размером 4х2. И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m). (Задание с урока).
 */

import java.util.Arrays;

public class Part13 {
    public static void main(String[] args) {
        char[][] array = {
                {'a', 'b'},
                {'c', 'd'},
                {'f', 'h'},
                {'d', 'i'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
