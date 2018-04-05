package com.lesson16.part09;

import java.util.*;

/**
 * Переделать задание, используя TreeMap
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Toy>map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 100));
        map.put("Cube", new Toy("Cube", 50));
        map.put("Car", new Toy("Car", 500));
        map.put("Peg-top", new Toy("Peg-top", 200));

        SortedMap<String, Toy>sortedMap = new TreeMap<>(map);

        iterateByEntry(sortedMap);
        iterateByKey(sortedMap);
        iterateByValue(sortedMap);
    }

    public static void iterateByEntry(Map<String, Toy>map){
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for(Map.Entry<String, Toy>entry: set){
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println();
    }

    public static void iterateByKey(Map<String, Toy>map){
        Set<String>keys = map.keySet();
        for (String key: keys){
            System.out.println(key + " ");
            System.out.println(map.get(key));
        }
        System.out.println();
    }

    public static void iterateByValue(Map<String, Toy>map){
        Collection<Toy>values = map.values();
        for (Toy toy: values){
            System.out.println(toy);
        }
    }
}
