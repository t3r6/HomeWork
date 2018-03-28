package com.lesson07;

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

public class MatrixDemo {
    public static void main(String[] args) {
        int a = 4;
        int n = (int) (Math.random() * 5 + 2);
        int[][] matrix1 = new int[a][a];
        int[][] matrix2 = new int[a][a];
        int[][] matrix3 = new int[a][a];
        Matrix matrix_1 = new Matrix(matrix1);
        Matrix matrix_2 = new Matrix(matrix2);

        System.out.println("Matrix1" + matrix_1);
        Matrix m1 = matrix_1.initialize();
        System.out.println("Matrix2" + matrix_2);
        Matrix m2 = matrix_2.initialize();
        m1.multiplication(m2, matrix3);
        Matrix additionResult = m1.addition(m2);
        System.out.println(additionResult);
        Matrix multiplby1 = m2.multiplyby1(n);
        System.out.println(multiplby1);
    }
}

