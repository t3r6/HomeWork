package com.lesson5;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */

import java.util.Arrays;

public class Part17 {
    public static void main(String[] args) {
        int[][] arrayDestination = new int[5][2];
        int[][] array = {
                {0, 1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29, 30, 31},
                {32, 33, 34, 35, 36, 37, 38, 39}};

        minmax(array, arrayDestination);

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(arrayDestination));
    }

    public static void minmax(int[][] array, int[][] arrayDestination) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            for (int j : array[i]) {
                if (j < min) {
                    min = j;
                } else if (j > max) {
                    max = j;
                }
            }
            arrayDestination[i][0] = min;
            arrayDestination[i][1] = max;
            System.out.println(min);
            System.out.println(max);
        }
    }
}



/*        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[i][min]) {
                    min = j;
                } else if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println(array[i][min]);
            System.out.println(max);
        }*/

