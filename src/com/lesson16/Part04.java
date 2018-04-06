package com.lesson16;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Напишите методы union(Set<?>... set) и intersect(Set<?> ... set),
 * реализующих операции объединения и пересечения множеств.
 * Протестируйте работу этих методов на предварительно заполненных множествах.
 */

public class Part04 {
    public static void main(String[] args) {
        Set<HeavyBox1> boxes1 = new TreeSet<>();
        Set<HeavyBox1> boxes2 = new TreeSet<>();
        Set<HeavyBox1> boxes3 = new TreeSet<>();


        boxes1.add(new HeavyBox1(1, 1, 1, 1));
        boxes1.add(new HeavyBox1(2, 2, 2, 2));
        boxes1.add(new HeavyBox1(3, 3, 3, 3));

        boxes2.add(new HeavyBox1(1, 1, 1, 1));
        boxes2.add(new HeavyBox1(5, 5, 5, 5));
        boxes2.add(new HeavyBox1(3, 3, 3, 3));

        boxes3.add(new HeavyBox1(7, 7, 7, 7));
        boxes3.add(new HeavyBox1(2, 2, 2, 2));
        boxes3.add(new HeavyBox1(3, 3, 3, 3));

        union(boxes1, boxes2, boxes3);
        intersect(boxes1, boxes2);
        intersect(boxes1, boxes3);
    }

    public static void union(Set<?>... set) {
        HashSet<?> result = new HashSet<>();
        /*TreeSet<?> result = new TreeSet<>();*/ // нет пересекающихся множеств
        for (Set s : set) {
            result.addAll(s);
        }
        result.forEach(System.out :: println);
        System.out.println();
    }

    public static void intersect(Set<?>... set) {
        TreeSet<?> result = (TreeSet) set[1];
        for (Set<?> s : set) {
            result.retainAll(s);
        }
        System.out.println(result);
    }
}
