package com.lesson05;

/**
 * Сделать задание 14 для алгоритма сортировки выбора.
 */

import java.util.Arrays;

public class Part19 {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
                {645, 364, 0, 3, 0, 346, 2, 6, 8},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            Part20.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

