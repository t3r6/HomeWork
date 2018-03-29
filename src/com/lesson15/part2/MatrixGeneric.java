package com.lesson15.part2;

/**
 * Переписать матрицу с использованием обобщенного класса. 
 */

public class MatrixGeneric<T extends Number, V extends Number> {
    private int row, col;
    private int[][] array;

    public MatrixGeneric(int[][] array) {
        this.row = array.length;
        this.col = array[0].length;
        this.array = array;
    }


    public MatrixGeneric initialize() {
        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        MatrixGeneric m = new MatrixGeneric(matrix1);
        return m;
    }

    public void multiplication(MatrixGeneric matrix1, int[][] res) {
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

    public MatrixGeneric multiplyby1(int n) {
        System.out.println("MatrixGeneric умножается на " + n);
        System.out.println(" Матрица matrix1:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= n;
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        MatrixGeneric m = new MatrixGeneric(array);
        return m;
    }

    public MatrixGeneric addition(MatrixGeneric matrix) {
        System.out.println("\nСумма матриц matrix1 и matrix2:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = this.array[i][j] + matrix.array[i][j];
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        MatrixGeneric m = new MatrixGeneric(array);
        return m;
    }

    @Override
    public String toString() {
        return "";
    }
}
