package com.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * а) Создать динамический массив, содержащий объекты класса HeavyBox.
 * б) Раcпечатать его содержимое используя for each.
 * в) Изменить вес первого ящика на 1.
 * г) Удалить последний ящик.
 * д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * е) Удалить все ящики. (Задание с урока)
 */

public class Part1 {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();
        list.add(new HeavyBox1(2, 2, 2, 2));
        list.add(new HeavyBox1(3, 3, 3, 3));
        list.add(new HeavyBox1(4, 4, 4, 4));
        HeavyBox1 heavyBox1 = new HeavyBox1();
        list.add(heavyBox1);

        System.out.println("Размер коллекции: " + list.size());
        for (HeavyBox1 box : list) {
            System.out.println("Элемент " + box);
        }
        System.out.println();
        HeavyBox1 firstBox = list.get(0);
        firstBox.weight = firstBox.weight + 1; //+=1
        list.set(0, firstBox);
        System.out.println("После увеличения weight нулевого элемента на 1: " + list);
        list.remove(list.size() - 1);
        System.out.println("Список после удаления последнего ящика: " + list + "\n");

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

        list.clear();
        System.out.println("После удаления: " + list);
    }
}
