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

public class MatrixV2Demo {
    public static void main(String[] args) {
        int a = 4;
        int n = (int) (Math.random() * 5 + 2);
        int[][] matrix1 = new int[a][a];
        int[][] matrix2 = new int[a][a];
        int[][] matrix3 = new int[a][a];
        MatrixV2 matrix_1 = new MatrixV2(matrix1);
        MatrixV2 matrix_2 = new MatrixV2(matrix2);
        MatrixV2 matrix_3 = new MatrixV2(matrix3);

        System.out.println("Matrix1" + matrix_1);
        MatrixV2 m1 = matrix_1.initialize(matrix_1);
        System.out.println();
        System.out.println("Matrix2" + matrix_2);
        MatrixV2 m2 = matrix_2.initialize(matrix_2);
        System.out.println();
        m1.multiplication(m2, matrix3);
        MatrixV2 additionResult = m1.addition(m2);
        System.out.println(additionResult);
        MatrixV2 multiplby1 = m2.multiplyby1(n);
        System.out.println(multiplby1);

    }
}

