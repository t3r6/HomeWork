package com.lesson11;

/**
 * а) Создайте объекты класса Double, используя методы valueOf().
 * б) Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
 * в) Преобразовать объект класса Double ко всем примитивным типам.
 * г) Вывести значение объекта Double на консоль.
 * д) Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
 * (Задание с урока)
 */

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = new Double(5.3);
        Double double2 = new Double("5.3");
        Double double3 = Double.valueOf(2.0);
        Double double4 = Double.valueOf("2.0");
        double double5 = Double.parseDouble("6.24");
        Double double6 = 2.3;
        Double double7 = 3.0;

        //б) Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
        String str = "122.202";
        double var = Double.parseDouble(str);

        //в) Преобразовать объект класса Double ко всем примитивным типам.
        byte b = double6.byteValue();
        short s = double6.shortValue();
        int i = double6.intValue();
        long l = double6.longValue();
        float ch = double6.floatValue();
        double double8 = double6.doubleValue();

        //д) Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
        String d = double4.toString(3.14);

        System.out.println(double1 + " " + double2 + " " + double3 + " " + double4 + " " + double5 +
                " " + double6 + " " + double7);
        System.out.println("Преобразование значение типа String к типу double: " + var);
        System.out.println("Преобразование объекта класса Double ко всем примитивным типам: " + b + " " + s + " " + i
                + " " + l + " " + ch + " " + double8);
        System.out.println("Преобразовать литерал типа double к строке: " + d);
    }
}
