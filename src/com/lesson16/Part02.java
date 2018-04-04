package com.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 */

public class Part02 {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();
        list.add(new HeavyBox1(1, 1, 1, 1));
        list.add(new HeavyBox1(3, 3, 3, 3));
        list.add(new HeavyBox1());
        HeavyBox1 heavyBox1 = new HeavyBox1(5,5,5,5);
        list.add(heavyBox1);

        System.out.println("Размер коллекции: " + list.size());

        //1 вариант
        Object[] objectArray = list.toArray();
        System.out.println("Массив v1: " + Arrays.toString(objectArray));

        //2 вариант
        HeavyBox1[] stringArray1 = new HeavyBox1[list.size()];
        list.toArray(stringArray1);
        System.out.println("Массив v2: " + Arrays.toString(stringArray1));

        //3 вариант
        HeavyBox1[] stringArray2 = list.toArray(new HeavyBox1[0]);
        System.out.println("Массив v3: " + Arrays.toString(stringArray2));
    }
}
