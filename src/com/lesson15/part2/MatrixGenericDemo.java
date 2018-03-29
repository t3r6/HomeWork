package com.lesson15.part2;

import com.lesson15.part2.MatrixGeneric;

/**
 * Переписать матрицу с использованием обобщенного класса. 
 */

public class MatrixGenericDemo {
    public static void main(String[] args) {
        int a = 4;
        int n = (int) (Math.random() * 5 + 2);
        int[][] matrix1 = new int[a][a];
        int[][] matrix2 = new int[a][a];
        int[][] matrix3 = new int[a][a];
        MatrixGeneric matrix_1 = new MatrixGeneric(matrix1);
        MatrixGeneric matrix_2 = new MatrixGeneric(matrix2);

        System.out.println("MatrixGeneric1" + matrix_1);
        MatrixGeneric m1 = matrix_1.initialize();
        System.out.println("MatrixGeneric2" + matrix_2);
        MatrixGeneric m2 = matrix_2.initialize();
        m1.multiplication(m2, matrix3);
        MatrixGeneric additionResult = m1.addition(m2);
        System.out.println(additionResult);
        MatrixGeneric multiplby1 = m2.multiplyby1(n);
        System.out.println(multiplby1);
    }
}

