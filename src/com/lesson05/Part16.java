package com.lesson05;

/**
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива
 * (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */

public class Part16 {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                {
                    if (array[j] < array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                        flag = true;
                    }
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}

