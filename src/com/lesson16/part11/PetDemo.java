package com.lesson16.part11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 * а в качестве значения класс Pet. Добавьте в отображение разных животных.
 * Создайте метод выводящий на консоль все все ключи отображения.
 */

public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("Popka", new Parrot("Popka", 5, "Africa"));
        petMap.put("Rex", new Dog("Rex", 10, "Pitbull"));
        petMap.put("Fatso", new Cat("Fatso", 7, "Black"));

        byKey(petMap);
    }

    public static void byKey(Map<String, Pet> map) {
        Set<String> set = map.keySet();
        set.forEach(System.out::println);
    }
}
