package com.lesson3;

/**
 * Создать программу, в которой последовательно прописать преобразования всех совместимых примитивных типов друг к другу.
 * Преобразование для каждого типа вынесите в отдельный метод.
 */

public class Part2 {
    public static void main(String[] args) {
        Byte_to_Byte();
        Byte_to_Short();
        Byte_to_Char();  //не выводиться
        Byte_to_Int();
        Byte_to_Long();
        Byte_to_Float();
        Byte_to_Double();
        // Byte_to_Boolean(); несовместимый тип
        Short_to_Byte();
        Short_to_Short();
        Short_to_Char();
        Short_to_Int();
        Short_to_Long();
        Short_to_Float();
        Short_to_Double();
        // Short_to_Boolean(); несовместимый тип
        Char_to_Byte();
        Char_to_Short();
        Char_to_Char();
        Char_to_Int();
        Char_to_Long();
        Char_to_Float();
        Char_to_Double();
        // Char_to_Boolean(); несовместимый тип
        Int_to_Byte();
        Int_to_Short();
        Int_to_Char();
        Int_to_Int();
        Int_to_Long();
        Int_to_Float();
        Int_to_Double();
        // Int_to_Boolean(); несовместимый тип
        Long_to_Byte();
        Long_to_Short();
        Long_to_Char();
        Long_to_Int();
        Long_to_Long();
        Long_to_Float();
        Long_to_Double();
        // Long_to_Boolean(); несовместимый тип
        Float_to_Byte();
        Float_to_Short();
        Float_to_Char(); //не выводиться
        Float_to_Int();
        Float_to_Long();
        Float_to_Float();
        Float_to_Double();
        // Float_to_Boolean(); //несовместимый тип
        Double_to_Byte();
        Double_to_Short();
        Double_to_Char(); //не выводиться
        Double_to_Int();
        Double_to_Long();
        Double_to_Float();
        Double_to_Double();
        // Double_to_Boolean(); // несовместимый тип
        // Boolean_to_Byte(); // несовместимый тип
        // Boolean_to_Short(); // несовместимый тип
        // Boolean_to_Char(); // несовместимый тип
        // Boolean_to_Int(); // несовместимый тип
        // Boolean_to_Long(); // несовместимый тип
        // Boolean_to_Float(); // несовместимый тип
        // Boolean_to_Double(); // несовместимый тип
        Boolean_to_Boolean();

    }

    public static void Byte_to_Byte() {
        byte i = 11;
        byte b = 22;
        b = (byte) i;
        System.out.println(b);
    }

    public static void Byte_to_Short() {
        byte i = 17;
        short b = 22;
        b = (short) i;
        System.out.println(b);
    }

    public static void Byte_to_Char() {
        byte i = 7;
        char b = 22;
        b = (char) i;
        System.out.println(b);  //не выводиться
    }

    public static void Byte_to_Int() {
        byte i = 3;
        int b = 22;
        b = (int) i;
        System.out.println(b);
    }

    public static void Byte_to_Long() {
        byte i = 4;
        long b = 22;
        b = (long) i;
        System.out.println(b);
    }

    public static void Byte_to_Float() {
        byte i = 5;
        float b = 22f;
        b = (float) i;
        System.out.println(b);
    }

    public static void Byte_to_Double() {
        byte i = 6;
        double b = 22;
        b = (double) i;
        System.out.println(b);
    }

    /*public static void Byte_to_Boolean() {
        byte i = 0;
        boolean b = true;
        b = (boolean) i;
        System.out.println(b);  // несовместимый тип
    }*/

    public static void Short_to_Byte() {
        short i = 457;
        byte b = 18;
        b = (byte) i;
        System.out.println(b);
    }

    public static void Short_to_Short() {
        short i = 457;
        short b = 185;
        b = (short) i;
        System.out.println(b);
    }

    public static void Short_to_Char() {
        short i = 457;
        char b = 185;
        b = (char) i;
        System.out.println(b);
    }

    public static void Short_to_Int() {
        short i = 27;
        int b = 185;
        b = (char) i;
        System.out.println(b);
    }

    public static void Short_to_Long() {
        short i = 237;
        long b = 185;
        b = (long) i;
        System.out.println(b);
    }

    public static void Short_to_Float() {
        short i = 47;
        float b = 185f;
        b = (float) i;
        System.out.println(b);
    }

    public static void Short_to_Double() {
        short i = 45;
        double b = 185d;
        b = (double) i;
        System.out.println(b);
    }

    /*public static void Short_to_Boolean() {
        short i = 1;
        boolean b = false;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

    public static void Char_to_Byte() {
        char i = 'c';
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void Char_to_Short() {
        char i = 3;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void Char_to_Char() {
        char i = 99;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void Char_to_Int() {
        char i = 19;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void Char_to_Long() {
        char i = 18;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void Char_to_Float() {
        char i = 19;
        float b = 15f;
        b = (float) i;
        System.out.println(b);
    }

    public static void Char_to_Double() {
        char i = 20;
        double b = 15;
        b = (double) i;
        System.out.println(b);
    }

   /* public static void Char_to_Boolean() {
        char i = 20;
        boolean b = true;
        b = (double) i;
        System.out.println(b); несовместимый тип
    }*/

    public static void Int_to_Byte() {
        int i = 658;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void Int_to_Short() {
        int i = 65797;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void Int_to_Char() {
        int i = 658;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void Int_to_Int() {
        int i = 68;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void Int_to_Long() {
        int i = -65646546;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void Int_to_Float() {
        int i = -65646546;
        float b = 15f;
        b = (float) i;
        System.out.println(b);
    }

    public static void Int_to_Double() {
        int i = -65646546;
        double b = 15;
        b = (double) i;
        System.out.println(b);
    }

 /*   public static void Int_to_Boolean() {
        int i = -65646546;
        boolean b = false;
        b = (boolean) i;
        System.out.println(b); несовместимый тип
    }*/

    public static void Long_to_Byte() {
        long i = 65688546;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void Long_to_Short() {
        long i = 9999;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void Long_to_Char() {
        long i = 9999;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void Long_to_Int() {
        long i = 564654659;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void Long_to_Long() {
        long i = 564999959;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void Long_to_Float() {
        long i = 564999959;
        float b = 15;
        b = (float) i;
        System.out.println(b);
    }

    public static void Long_to_Double() {
        long i = 564999959;
        double b = 15;
        b = (double) i;
        System.out.println(b);
    }

    /*public static void Long_to_Boolean() {
        long i = 564999959;
        boolean b = true;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

    public static void Float_to_Byte() {
        float i = 5649.99959f;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void Float_to_Short() {
        float i = 9.99959f;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void Float_to_Char() {
        float i = 9.99f;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void Float_to_Int() {
        float i = 19.99f;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void Float_to_Long() {
        float i = 20.99f;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void Float_to_Float() {
        float i = 20.99f;
        float b = 15f;
        b = (float) i;
        System.out.println(b);
    }

    public static void Float_to_Double() {
        float i = 20.99f;
        double b = 15;
        b = (double) i;
        System.out.println(b);
    }

    /*public static void Float_to_Boolean() {
        float i = 20.99f;
        boolean b = true;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

    public static void Double_to_Byte() {
        double i = 21.99;
        byte b = 15;
        b = (byte) i;
        System.out.println(b);
    }

    public static void Double_to_Short() {
        double i = 22.99;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void Double_to_Char() {
        double i = 22.99;
        char b = 15;
        b = (char) i;
        System.out.println(b); //не выводиться
    }

    public static void Double_to_Int() {
        double i = 22.99;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void Double_to_Long() {
        double i = 23.99;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void Double_to_Float() {
        double i = 23.99;
        float b = 15;
        b = (float) i;
        System.out.println(b);
    }

    public static void Double_to_Double() {
        double i = 23.99;
        double b = 15;
        b = (double) i;
        System.out.println(b);
    }

    /*public static void Double_to_Boolean() {
        double i = 23.99;
        boolean b = false;
        b = (boolean) i;
        System.out.println(b); // несовместимый тип
    }*/

   /* public static void Boolean_to_Byte() {
        boolean i = true;
        byte b = 15;
        b = (byte) i;
        System.out.println(b); // несовместимый тип
    }*/

   /* public static void Boolean_to_Short() {
        boolean i = true;
        short b = 15;
        b = (short) i;
        System.out.println(b);
    }

    public static void Boolean_to_Char() {
        boolean i = true;
        char b = 15;
        b = (char) i;
        System.out.println(b);
    }

    public static void Boolean_to_Int() {
        boolean i = true;
        int b = 15;
        b = (int) i;
        System.out.println(b);
    }

    public static void Boolean_to_Long() {
        boolean i = true;
        long b = 15;
        b = (long) i;
        System.out.println(b);
    }

    public static void Boolean_to_Float() {
        boolean i = true;
        float b = 15f;
        b = (float) i;
        System.out.println(b);
    }

    public static void Boolean_to_Double() {
        boolean i = true;
        double b = 15;
        b = (double) i;
        System.out.println(b);
    }*/

    public static void Boolean_to_Boolean() {
        boolean i = true;
        boolean b = false;
        b = (boolean) i;
        System.out.println(b);
    }
}
