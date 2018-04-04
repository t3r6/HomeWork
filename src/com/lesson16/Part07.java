package com.lesson16;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Создать очередь, содержащую объекты класса HeavyBox.
 * Используем класс ArrayDeque. Поместить объекты в очередь с помощью метода offer().
 * Удалить объекты методом poll().  (Задание с урока)
 */

public class Part07 {
    public static void main(String[] args) {
        Deque<HeavyBox1> queue = new ArrayDeque<>();
        HeavyBox1 box = new HeavyBox1(2, 2, 2, 2);
        queue.offer(new HeavyBox1(1, 1, 1, 1));
        queue.offer(new HeavyBox1(2, 2, 2, 2));
        queue.offer(box);

        while (queue.size() != 0) {
            System.out.println(queue.poll());
        }
    }
}
