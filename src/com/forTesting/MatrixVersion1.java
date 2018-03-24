package com.forTesting;

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

public class MatrixVersion1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 4;
        int n = (int) (Math.random() * 5 + 2);
        int[][] matrix1 = new int[a][];
        int[][] matrix2 = new int[b][];
        int[][] matrix3 = new int[a][b];
        int[][] matrix4 = new int[a][];

        for (int i = 0; i < matrix4.length; i++) matrix4[i] = new int[c];

        System.out.println("Matrix");
        for (int i = 0; i < matrix1.length; i++) {
            matrix1[i] = new int[b];
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
                printMatrix1(matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix2");
        for (int i = 0; i < matrix2.length; i++) {
            matrix2[i] = new int[c];
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (int) (Math.random() * 10);
                printMatrix2(matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        multiplication(matrix1, matrix2, matrix4);

        addition(matrix1, matrix2, matrix3);
        System.out.println();

        multiplyby1(n, matrix1);
        System.out.println();
    }

    private static void multiplication(int[][] matrix1, int[][] matrix2, int[][] matrix4) {
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

    private static void printMatrix2(int i) {
        System.out.print(" " + i);
    }

    private static void printMatrix1(int i) {
        System.out.print(" " + i);
    }

    private static void multiplyby1(int n, int[][] matrix1) {
        System.out.println("Matrix умножается на " + n);
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
