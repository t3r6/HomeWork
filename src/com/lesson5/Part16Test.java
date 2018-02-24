package com.lesson5;

import java.util.Arrays;

/**
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива
 * (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */

public class Part16Test {
    public static void main(String[] args) {
        int[][] data = {
                {0, 3, 2, 1, 4},
                {0, 2, 5, 3, 4},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            Part16.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}