package com.lesson6;

import java.util.Arrays;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * <p>
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать;
 * 4) умножение матриц - по желанию.
 */

public class Matrix {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        int n = (int) (Math.random() * 5 + 2);
        int[][] matrix1 = new int[a][];
        int[][] matrix2 = new int[b][];
        int[][] matrix3 = new int[a][b];
        int[][] matrix4 = new int[a][];

       /* Matrix matrix2 = new Matrix(5, 5);  // Почему не работает конструктор?
        Matrix matrix3 = new Matrix(5, 5);*/

        for (int i = 0; i < matrix4.length; i++) matrix4[i] = new int[c];

        System.out.println("Matrix1");
        for (int i = 0; i < matrix1.length; i++) {
            matrix1[i] = new int[b];
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
                PrintMatrix1(matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matrix2");
        for (int i = 0; i < matrix2.length; i++) {
            matrix2[i] = new int[c];
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (int) (Math.random() * 10);
                PrintMatrix2(matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        Multiplication(matrix1, matrix2, matrix4);

        addition(matrix1, matrix2, matrix3);
        System.out.println();

        Multiplyby1(n, matrix1);
        System.out.println();


    }

    private static void Multiplication(int[][] matrix1, int[][] matrix2, int[][] matrix4) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix4[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Результат умножения матриц: ");
        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                System.out.print(" " + matrix4[i][j]);
            }
            System.out.println();
        }
    }

    private static void PrintMatrix2(int i) {
        System.out.print(" " + i);
    }

    private static void PrintMatrix1(int i) {
        System.out.print(" " + i);
    }


    private static void Multiplyby1(int n, int[][] matrix1) {
        System.out.println("Matrix1 умножается на " + n);
        System.out.println(" Матрица matrix1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] *= n;
                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }
    }

    private static void addition(int[][] matrix1, int[][] matrix2, int[][] matrix3) {
        System.out.println("\nСумма матриц matrix1 и matrix2:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(" " + matrix3[i][j]);
            }
            System.out.println();
        }
    }
}
