package com.lesson05;

/**
 * Реализовать подсчет факториала используя цикл for.
       * n! = 1*2*...*n;​
       * 0!=1;
       * 5! = 1*2*3*4*5;
       * Число n задается случайным образом (используйте Math.random()).
 */

public class Part09 {
    public static void main(String[] args) {
        int i, fact = 1;
        double n = (int) getRandomValue(5);
        if (n < 0)   // необязательная строка, т.к. Math.random() возвращает положительные числа
            System.out.println("Number should be non-negative.");
        else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is = " + fact);
        }
    }

    public static double getRandomValue(int a) {
        return Math.random() * a;
    }
}