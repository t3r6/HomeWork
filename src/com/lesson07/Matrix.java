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

public class Matrix {
    private int row, col;
    private int[][] array;

    public Matrix(int[][] array) {
        this.row = array.length;
        this.col = array[0].length;
        this.array = array;
    }


    public Matrix initialize() {
        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        Matrix m = new Matrix(matrix1);
        return m;
    }

    public void multiplication(Matrix matrix1, int[][] res) {
        for (int i = 0; i < matrix1.row; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                for (int k = 0; k < this.array.length; k++) {
                    res[i][j] += matrix1.array[i][k] * this.array[k][j];
                }
            }
        }

        System.out.println("Результат умножения матриц: ");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(" " + res[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix multiplyby1(int n) {
        System.out.println("Matrix умножается на " + n);
        System.out.println(" Матрица matrix1:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= n;
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        Matrix m = new Matrix(array);
        return m;
    }

    public Matrix addition(Matrix matrix) {
        System.out.println("\nСумма матриц matrix1 и matrix2:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = this.array[i][j] + matrix.array[i][j];
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        Matrix m = new Matrix(array);
        return m;
    }

    @Override
    public String toString() {
        return "";
    }
}
