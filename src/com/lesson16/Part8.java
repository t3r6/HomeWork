package com.lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создать коллекцию, содержащую объекты HeavyBox.
 * Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
 * Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию. (Задание с урока)
 */

public class Part8 {
    public static void main(String[] args) {
        List<HeavyBox1>list = new ArrayList<>();
        list.add(new HeavyBox1());
        list.add(new HeavyBox1(1,1,1,1));
        list.add(new HeavyBox1(1,1,1,400));
        list.add(new HeavyBox1(1,1,1,500));

        System.out.println(getBigBoxes(list));
        System.out.println("\n" + list);
    }
    public static List<HeavyBox1>getBigBoxes(List<HeavyBox1>list){
        List<HeavyBox1>result = new ArrayList<>();

        Iterator<HeavyBox1>iterator = list.iterator();
        while(iterator.hasNext()){
            HeavyBox1 box = iterator.next();
            if (box.weight > 300){
                iterator.remove();
                result.add(box);
            }
        }
        return result;
    }
}
