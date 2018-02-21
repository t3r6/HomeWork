package com.forTesting;

import java.util.Arrays;

public class Everything {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {11, 12, 13, 14, 15, 16, 17, 18},
                {21, 22, 23, 24, 25, 26, 27, 28},
                {31, 32, 33, 34, 35, 36, 37, 38},
                {41, 42, 43, 44, 45, 46, 47, 48},
        };
        int[][] newArray = new int[5][2];

        min(array, newArray);
        max(array, newArray);

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(newArray));
    }

    public static void min(int[][] a, int[][] newArray) {

        for (int i = 0; i < a.length; i++) {
            int min = a[i][0];
            for (int j : a[i]) {
                if (j < min) {
                    min = j;
                }
            }
            System.out.println(min);
            newArray[i][0] = min;
        }
    }

    public static void max(int[][] a, int[][] newArray) {

        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j : a[i]) {
                if (j > max) {
                    max = j;
                }
            }
            System.out.println(max);
            newArray[i][1] = max;
        }
    }

}

