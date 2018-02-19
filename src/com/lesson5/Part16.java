package com.lesson5;

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
                first:
                {
                /*for (int j = array.length - 1; j > i; j--) {*/
                    for (int j = 0; j < i; j++) {
                        {
                            if (array[j - 1] > array[j]) {
                                int tmp = array[j - 1];
                                array[j - 1] = array[j];
                                array[j] = tmp;

                            /*int tmp = array[j];
                            array[j] = array[j - 1];
                            array[j - 1] = tmp;*/
                                break first;
                            }
                        }
                    }
                }
            }
        }
    }
