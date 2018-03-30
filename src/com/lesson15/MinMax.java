package com.lesson15;

import java.util.Arrays;

/**
 * Написать обобщенный класс MinMax,
 * который содержит методы для нахождения минимального и максимального элемента массива.
 * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 */

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public void printMinMax() {
        double min = array[0].doubleValue();
        double max = array[0].doubleValue();
        for (T element : array) {
            if (element.doubleValue() > max) {
                max = element.doubleValue();
            } else if (element.doubleValue() < min) {
                min = element.doubleValue();
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static void main(String[] args) {
        Integer[] array = {2, 0, 1, 6, 8, 7, 5, 3};
        MinMax<Integer> object = new MinMax<>(array);
        object.printMinMax();
    }
}
