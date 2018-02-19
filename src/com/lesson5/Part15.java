package com.lesson5;

/**
 * Создать табличку для любого массива, в котором последовательно прописать значения i, j,
 * массива для  каждого цикла алгоритма сортировки пузырька.
 * Используйте debugger. Например для массива 0 2 5 3 4:
 * Пример массива:
*/

import java.util.Arrays;

public class Part15 {
    public static void main(String[] args) {
        int[][] data = {
                {0, 3, 2, 1, 4},
              //  {0, 2, 5, 3, 4},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            BubbleSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
