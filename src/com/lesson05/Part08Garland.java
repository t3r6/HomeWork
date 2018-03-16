package com.lesson05;

/**
 * Переписать гирлянду используя оператор switch для  выбора  нужной операции.
 */

import java.util.Scanner;

public class Part08Garland {
    public static void main(String[] args) {
        int garland = 78;
        Scanner scanner = new Scanner(System.in);
        int kol = getKol(scanner);
        changeMode(garland, scanner, kol);
    }

    private static int getKol(Scanner scanner) {
        System.out.println("Введите количество итераций");
        int kol = 10;
        if (scanner.hasNextInt()) {
            kol = scanner.nextInt();
        }
        return kol;
    }

    private static void changeMode(int garland, Scanner scanner, int k) {
        System.out.println("Введите 1 из 3 режимов ");
        if (scanner.hasNextInt()) {
            int mode = scanner.nextInt();
            //           int garland = 78;
/*            currentstate(garland);
            // blink(garland);
            runString(garland);*/
            switch (mode) {
                case 1:
                    blink(garland, k);
                    break;
                case 2:
                    runString(garland, k);
                    break;
                case 3:
                    currentstate(garland);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    static void blink(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = ~g;
            currentstate(g);
        }
    }

    static void runString(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = g << 1;
            currentstate(g);
        }
    }

    private static void currentstate(int garland) {
        System.out.printf("%32s\n", Integer.toBinaryString(garland));
    }

}
