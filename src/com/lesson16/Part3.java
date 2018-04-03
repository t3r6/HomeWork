package com.lesson16;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable.
 * Распечатать содержимое с помощью for each. (Задание с урока)
 */

public class Part3 {
    public static void main(String[] args) {
        SortedSet<HeavyBox1> set = new TreeSet<>();
        set.add(new HeavyBox1(2,2,2,2));
        set.add(new HeavyBox1(3,3,3,3));
        set.add(new HeavyBox1(2,1,2,2));
        set.add(new HeavyBox1(1,1,1,1));
        set.add(new HeavyBox1(1,8,1,1));
        for (HeavyBox1 box : set) {
            System.out.println(box);
        }
    }
}
