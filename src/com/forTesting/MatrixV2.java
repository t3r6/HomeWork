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

public class MatrixV2 {
    int row, col;
    int[][] array;

    public MatrixV2(int[][] array) {
        this.row = array.length;
        this.col = array[0].length;
        this.array = array;
    }


    public MatrixV2 initialize(MatrixV2 matrix) {
        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix1[i][j] + " ");
            }

            System.out.println();
        }
        MatrixV2 m = new MatrixV2(matrix1);
        return m;
    }

    public static void multiplication(int[][] matrix1, int[][] matrix2, int[][] matrix4) {
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

    public MatrixV2 multiplyby1(int n) {
        System.out.println("Matrix умножается на " + n);
        System.out.println(" Матрица matrix1:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= n;
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        MatrixV2 m = new MatrixV2(array);
        return m;
    }

    public MatrixV2 addition(MatrixV2 matrix) {
        System.out.println("\nСумма матриц matrix1 и matrix2:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = this.array[i][j] + matrix.array[i][j];
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        MatrixV2 m = new MatrixV2(array);
        return m;
    }
}
