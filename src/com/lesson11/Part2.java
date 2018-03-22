package com.lesson11;

/**
 * Заполнение таблицы
 */

public class Part2 {
    public static void main(String[] args) {
        Boolean bool1 = true;
        Byte byte1 = 8;
        Character char1 = 'd';
        Double double1 = 2.5;
        Float fl1 = 5.85f;
        Integer int1 = 11;
        Long lg1 = 265L;
        Short short1 = 36;

        /*byte b2 = bool1.byteValue();
        double doub2 = bool1.doubleValue();
        float ch2 = bool1.floatValue();
        int i2 = bool1.intValue();
        long l2 = bool1.longValue();
        short s2 = bool1.shortValue();*/
        boolean var2 = Boolean.parseBoolean("122.202");
        /*boolean bool2 = Boolean.parseBoolean("122.202", 1);*/ //no radix
        /*boolean bool3 = Boolean.valueOf("122.202", 2);*/ //no radix
        String d3 = Boolean.toString(true);
        String d4 = bool1.toString();
        /*String d5 = bool1.toString(true, 1.0);*/ //no radix
        System.out.println("Boolean: " + var2 + " " + d3 + " " + d4);

        byte b3 = byte1.byteValue();
        double byte2 = byte1.doubleValue();
        float ch3 = byte1.floatValue();
        int i3 = byte1.intValue();
        long l3 = byte1.longValue();
        short s3 = byte1.shortValue();
        byte var3 = Byte.parseByte("9");
        byte var4 = Byte.parseByte("11", 16);
        Byte byte3 = Byte.valueOf("11", 16);
        String d5 = Byte.toString((byte) 10);
        String d6 = byte1.toString();
        /*String d7 = byte1.toString(6, 1);*/
        System.out.println("Byte: " + b3 + " " + byte2 + " " + ch3 + " " +
                i3 + " " + l3 + " " + s3 + " " + var3 + " " + " " + d5 + " " + d6 + " " + var4 + " " + byte3);

       /* byte b4 = char1.byteValue();
        double char2 = char1.doubleValue();
        float ch4 = char1.floatValue();
        int i4 = char1.intValue();
        long l4 = char1.longValue();
        short s4 = char1.shortValue();
        char var4 = Character.parseCharacter("122.202");
        char var5 = Character.parseCharacter("122.202", 1)*/
        ; //no radix
        /*Character char3 = Character.valueOf('H', 1);*/ //no radix
        String d7 = Character.toString('a');
        String d8 = char1.toString();
        /*String d9 = char1.toString('s', 1);*/ //no radix
        System.out.println("Character: " + d7 + " " + d8);

        byte b1 = double1.byteValue();
        double double2 = double1.doubleValue();
        float ch1 = double1.floatValue();
        int i1 = double1.intValue();
        long l1 = double1.longValue();
        short s1 = double1.shortValue();
        double var1 = Double.parseDouble("122.202");
        /*double var2 = Double.parseDouble("122.202", 1); //no radix
        /*Double double3 = Double.valueOf(3.0, 1);*/ //no radix
        String d1 = Double.toString(3.14);
        String d2 = double1.toString(3.14);
        /*String d3 = double1.toString(3.14, 1.0);*/ //no radix
        System.out.println("Double: " + b1 + " " + double2 + " " + ch1 + " " +
                i1 + " " + l1 + " " + s1 + " " + var1 + " " + d1 + " " + d2);

        byte b5 = fl1.byteValue();
        double fl2 = fl1.doubleValue();
        float ch5 = fl1.floatValue();
        int i5 = fl1.intValue();
        long l5 = fl1.longValue();
        short s5 = fl1.shortValue();
        float var5 = Float.parseFloat("122.202");
        /*float var6 = Float.parseFloat("122.202", 1);*/ //no radix
        /*Float fl3 = Float.valueOf("3.6", 1);*/ //no radix
        String d9 = Float.toString(3.14f);
        String d10 = fl1.toString();
        /*String d5 = fl1.toString(3.14, 1);*/ //no radix
        System.out.println("Float: " + b5 + " " + fl2 + " " + ch5 + " " +
                i5 + " " + l5 + " " + s5 + " " + var5 + " " + d9 + " " + d10);

        byte b6 = int1.byteValue();
        double int2 = int1.doubleValue();
        float ch6 = int1.floatValue();
        int i6 = int1.intValue();
        long l6 = int1.longValue();
        short s6 = int1.shortValue();
        int var6 = Integer.parseInt("122");
        int var7 = Integer.parseInt("11", 16);
        Integer fl3 = Integer.valueOf("11", 16);
        String d91 = Integer.toString(3);
        String d12 = int1.toString();
        String d51 = int1.toString(3, 1);
        System.out.println("Integer: " + b6 + " " + int2 + " " + ch6 + " " +
                i6 + " " + l6 + " " + s6 + " " + var6 + " " + var7 + " " + fl3 + " " + d91 + " " + d12 + " " + d51);

        byte b7 = lg1.byteValue();
        double lg2 = lg1.doubleValue();
        float ch7 = lg1.floatValue();
        int i7 = lg1.intValue();
        long l7 = lg1.longValue();
        short s7 = lg1.shortValue();
        long var8 = Long.parseLong("122");
        long var9 = Long.parseLong("11", 16);
        Long lg3 = Long.valueOf("11", 16);
        String d14 = Long.toString(3);
        String d15 = lg1.toString();
        String d16 = lg1.toString(3, 1);
        System.out.println("Long: " + b7 + " " + lg2 + " " + ch7 + " " +
                i7 + " " + l7 + " " + s7 + " " + var8 + " " + var9 + " " + lg3 + " " + d14 + " " + d15 + " " + d16);

        byte b8 = short1.byteValue();
        double short2 = short1.doubleValue();
        float ch8 = short1.floatValue();
        int i8 = short1.intValue();
        long l8 = short1.longValue();
        short s8 = short1.shortValue();
        long var10 = Short.parseShort("122");
        long var11 = Short.parseShort("11", 16);
        Short short3 = Short.valueOf("11", 16);
        String d17 = Short.toString((short)3);
        String d18 = short1.toString();
        /*String d19 = short1.toString(3, 1);*/
        System.out.println("Short: " + b8 + " " + short2 + " " + ch8 + " " +
                i8 + " " + l8 + " " + s8 + " " + var10 + " " + var11 + " " + short3 + " " + d17 + " " + d18);
    }
}
