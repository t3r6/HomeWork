package com.lesson16;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
 * Избавиться от повторяющихся элементов в строке и вывести результат на экран.
 */

public class Part05 {
    public static void main(String[] args) {
    System.out.println(duplicates(1, 2, 3, 4, 4, 5));
}

    public static Set<Integer> duplicates(Integer... elements) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(elements));
        return set;
    }
}