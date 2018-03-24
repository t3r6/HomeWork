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
        int a = 4;  //a < b must be always
        int b = 5;
        int n = (int) (Math.random() * 5 + 2);
        int[][] matrix1 = new int[a][b];
        int[][] matrix2 = new int[b][b];
        MatrixV2 matrix_1 = new MatrixV2(matrix1);
        MatrixV2 matrix_2 = new MatrixV2(matrix2);

        System.out.println("Matrix1" + matrix_1);
        MatrixV2 m1 = matrix_1.initialize(matrix_1);
        System.out.println();
        System.out.println("Matrix2" + matrix_2);
        MatrixV2 m2 = matrix_2.initialize(matrix_2);
       /* MatrixV2 multiplication = m2.multiplication(m1);
        System.out.println(multiplication);*/
        MatrixV2 additionResult = m1.addition(m2);
        System.out.println(additionResult);
        MatrixV2 multiplby1 = m2.multiplyby1(n);
        System.out.println(multiplby1);

    }
}

