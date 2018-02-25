package com.forTesting;

import java.util.Arrays;

public class Anything {
        public static int N = 5;    // Размер матрицы

        public static void main(String [] args) {

            int [][] A = new int [N][N];
            int [][] B = new int [N][N];
            int [][] C = new int [N][N];

            // Заполнение и печать на экран матрицы A
            System.out.println(" Матрица A:");
            for(int i = 0; i < A.length; i++) {
                for(int j = 0; j < A[i].length; j++) {
                    A[i][j] = (int) (Math.random() * 20 + 1);
                    System.out.print(" " + A[i][j]);
                }
                System.out.println();
            }

            // Заполнение и печать на экран матрицы B
            System.out.println("\n Матрица B:");
            for(int i = 0; i < B.length; i++) {
                for(int j = 0; j < B[i].length; j++) {
                    B[i][j] = (int) (Math.random() * 20 + 1);
                    System.out.print(" " + B[i][j]);
                }
                System.out.println();
            }

            // Сумма матриц
            System.out.println("\n Сумма матриц A и B:");
            for(int i = 0; i < C.length; i++) {
                for(int j = 0; j < C[i].length; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.print(" " + C[i][j]);
                }
                System.out.println();
            }
        }
    }
