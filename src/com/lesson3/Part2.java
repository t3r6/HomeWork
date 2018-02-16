package com.lesson3;

/**
 * Создать программу, в которой последовательно прописать преобразования всех совместимых примитивных типов друг к другу.
 * Преобразование для каждого типа вынесите в отдельный метод.
 */

public class Part2 {
    public static void main(String[] args) {
        byteToByte();
        byteToShort();
        byteToChar();  //не выводиться
        byteToInt();
        byteToLong();
        byteToFloat();
        byteToDouble();
        // byteToBoolean(); несовместимый тип
        shortToByte();
        shortToShort();
        shortToChar();
        shortToInt();
        shortToLong();
        shortToFloat();
        shortToDouble();
        // shortToBoolean(); несовместимый тип
        charToByte();
        charToShort();
        charToChar();
        charToInt();
        charToLong();
        charToFloat();
        charToDouble();
        // charToBoolean(); несовместимый тип
        intToByte();
        intToShort();
        intToChar();
        intToInt();
        intToLong();
        intToFloat();
        intToDouble();
        // intToBoolean(); несовместимый тип
        longToByte();
        longToShort();
        longToChar();
        longToInt();
        longToLong();
        longToFloat();
        longToDouble();
        // longToBoolean(); несовместимый тип
        floatToByte();
        floatToShort();
        floatToChar(); //не выводиться
        floatToInt();
        floatToLong();
        floatToFloat();
        floatToDouble();
        // floatToBoolean(); //несовместимый тип
        doubleToByte();
        doubleToShort();
        doubleToChar(); //не выводиться
        doubleToInt();
        doubleToLong();
        doubleToFloat();
        doubleToDouble();
        // doubleToBoolean(); // несовместимый тип
        // booleanToByte(); // несовместимый тип
        // booleanToShort(); // несовместимый тип
        // booleanToChar(); // несовместимый тип
        // booleanToInt(); // несовместимый тип
        // booleanToLong(); // несовместимый тип
        // booleanToFloat(); // несовместимый тип
        // booleanToDouble(); // несовместимый тип
        booleanToBoolean();

    }

    public static void byteToByte() {
        byte i = 11;
        byte b = 22;
        b = i;
        System.out.println(b);
    }

    public static void byteToShort() {
        byte i = 17;
        short b = 22;
        b = i;
        System.out.println(b);
    }

    public static void byteToChar() {
        byte i = 7;
        char b = 22;
        b = (char) i;
        System.out.println(b);  //не выводиться
    }

    public static void byteToInt() {
        byte i = 3;
        int b = 22;
        b = i;
        System.out.println(b);
    }

    public static void byteToLong() {
        byte i = 4;
        long b = 22;
        b = i;
        System.out.println(b);
    }

    public static void byteToFloat() {
        byte i = 5;
        float b = 22f;
        b = i;
        System.out.println(b);
    }

    public static void byteToDouble() {
        byte i = 6;
        double b = 22;
        b = i;
        System.out.println(b);
    }

    /*public static void byteToBoolean() {
        byte i = 0;
        boolean b = true;
        b = (boolean) i;
        System.out.println(b);  // несовместимый тип
    }*/

    public static void shortToByte() {
        short i = 457;
        byte b = 18;
        b = (byte) i;
        System.out.println(b);
    }

    public static void shortToShort() {
        short i = 457;
        short b = 185;
        b = i;
        System.out.println(b);
    }

    public static void shortToChar() {
        short i = 457;
        char b = 185;
        b = (char) i;
        System.out.println(b);
    }

    public static void shortToInt() {
        short i = 27;
        int b = 185;
        b = i;
        System.out.println(b);
    }

    public static void shortToLong() {
        short i = 237;
        long b = 185;
        b = i;
        System.out.println(b);
    }

    public static void shortToFloat() {
        short i = 47;
        float b = 185f;
        b = i;
        System.out.println(b);
    }

    public static void shortToDouble() {
        short i = 45;
        double b = 185d;
        b = i;
        System.out.println(b);
    }

    /*public static void shortToBoolean() {
        short i = 1;
        boolean b = false;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

    public static void charToByte() {
        char i = 'c';
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void charToShort() {
        char i = 3;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void charToChar() {
        char i = 99;
        char b = 15;
        b = i;
        System.out.println(b);
    }

    public static void charToInt() {
        char i = 19;
        int b = 15;
        b = i;
        System.out.println(b);
    }

    public static void charToLong() {
        char i = 18;
        long b = 15;
        b = i;
        System.out.println(b);
    }

    public static void charToFloat() {
        char i = 19;
        float b = 15f;
        b = i;
        System.out.println(b);
    }

    public static void charToDouble() {
        char i = 20;
        double b = 15;
        b = i;
        System.out.println(b);
    }

   /* public static void charToBoolean() {
        char i = 20;
        boolean b = true;
        b = (double) i;
        System.out.println(b); несовместимый тип
    }*/

    public static void intToByte() {
        int i = 658;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void intToShort() {
        int i = 65797;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void intToChar() {
        int i = 658;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void intToInt() {
        int i = 68;
        int b = 15;
        b = i;
        System.out.println(b);
    }

    public static void intToLong() {
        int i = -65646546;
        long b = 15;
        b = i;
        System.out.println(b);
    }

    public static void intToFloat() {
        int i = -65646546;
        float b = 15f;
        b = i;
        System.out.println(b);
    }

    public static void intToDouble() {
        int i = -65646546;
        double b = 15;
        b = i;
        System.out.println(b);
    }

 /*   public static void intToBoolean() {
        int i = -65646546;
        boolean b = false;
        b = (boolean) i;
        System.out.println(b); несовместимый тип
    }*/

    public static void longToByte() {
        long i = 65688546;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void longToShort() {
        long i = 9999;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void longToChar() {
        long i = 9999;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void longToInt() {
        long i = 564654659;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void longToLong() {
        long i = 564999959;
        long b = 15;
        b = i;
        System.out.println(b);
    }

    public static void longToFloat() {
        long i = 564999959;
        float b = 15;
        b = i;
        System.out.println(b);
    }

    public static void longToDouble() {
        long i = 564999959;
        double b = 15;
        b = i;
        System.out.println(b);
    }

    /*public static void longToBoolean() {
        long i = 564999959;
        boolean b = true;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

    public static void floatToByte() {
        float i = 5649.99959f;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void floatToShort() {
        float i = 9.99959f;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void floatToChar() {
        float i = 9.99f;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void floatToInt() {
        float i = 19.99f;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void floatToLong() {
        float i = 20.99f;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void floatToFloat() {
        float i = 20.99f;
        float b = 15f;
        b = i;
        System.out.println(b);
    }

    public static void floatToDouble() {
        float i = 20.99f;
        double b = 15;
        b = i;
        System.out.println(b);
    }

    /*public static void floatToBoolean() {
        float i = 20.99f;
        boolean b = true;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

    public static void doubleToByte() {
        double i = 21.99;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void doubleToShort() {
        double i = 22.99;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void doubleToChar() {
        double i = 22.99;
        char b = 15;
        b = (char) i;
        System.out.println(b); //не выводиться
    }

    public static void doubleToInt() {
        double i = 22.99;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void doubleToLong() {
        double i = 23.99;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void doubleToFloat() {
        double i = 23.99;
        float b = 15;
        b = (float) i;
        System.out.println(b);
    }

    public static void doubleToDouble() {
        double i = 23.99;
        double b = 15;
        b = i;
        System.out.println(b);
    }

    /*public static void doubleToBoolean() {
        double i = 23.99;
        boolean b = false;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

   /* public static void booleanToByte() {
        boolean i = true;
        byte b = 15;
        b = (byte) i;
        System.out.println(b); // несовместимый тип
    }*/

   /* public static void booleanToShort() {
        boolean i = true;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void booleanToChar() {
        boolean i = true;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void booleanToInt() {
        boolean i = true;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void booleanToLong() {
        boolean i = true;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void booleanToFloat() {
        boolean i = true;
        float b = 15f;
        b = (float) i;
        System.out.println(b);
    }

    public static void booleanToDouble() {
        boolean i = true;
        double b = 15;
        b = (double) i;
        System.out.println(b);
    }*/

    public static void booleanToBoolean() {
        boolean i = true;
        boolean b = false;
        b = i;
        System.out.println(b);
    }
}
