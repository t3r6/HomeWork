package com.forTesting;

import java.util.Arrays;

public class Anything {
    public static void main(String[] args) {
        int[] garland = new int[32];
        for (int i = 0; i < garland.length; i++) {
            if (i % 2 == 0) {
                garland[i] = 0;
            } else {
                garland[i] = 1;
            }
        }

        currentState(garland);
        ticker(garland);
        blinking(garland);
        checkTheFirst(garland[0]);
    }

    private static void checkTheFirst(int i) {
        if (i == 1) {
            System.out.println("Bulb is on");
        } else {
            System.out.println("Bulb is off");
        }
    }

    private static void blinking(int[] garland) {
        for (int j = 0; j < garland.length; j++) {
            if (garland[j] == 1) {
                garland[j] = 0;
            } else {
                garland[j] = 1;
            }
        }
        currentState(garland);
    }

    private static void ticker(int[] garland) {
        for (int i = 0; i < 53; i++) {
            System.arraycopy(garland, 0, garland, 1, garland.length - 1);
            currentState(garland);
        }
    }

    private static void currentState(int[] garland) {
        System.out.println(Arrays.toString(garland));
    }
}
