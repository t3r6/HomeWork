package com.lesson7;

import java.util.Random;

/**
 * Даны два целых числа A и В.
 * Выведите все числа от A до B включительно, в порядке возрастания,
 * если A < B, или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */

public class Part5Recursion {
    public static void main(String[] args) {
        functionOne(1, 10);
        System.out.println();
        functionOne(10, 1);
    }

    private static void functionOne(int a, int b) {
        if (a > b) {
            inRecursionAndReversed(a, b);
        } else {
            inRecursion(a, b);
        }
    }

    private static void inRecursion(int c, int limit) {
        System.out.print(c + " ");
        if (c < limit) {
            inRecursion (c + 1, limit);
        }
    }

    private static void inRecursionAndReversed(int c, int limit) {
        System.out.print(c + " ");
        if (c > limit) {
            inRecursionAndReversed (c - 1, limit);
        }
    }
}

