package com.lesson10.part4;

/**
 * a) Создать перечисление, содержащее размеры одежды (XXS,XS,S,M,L).
 * Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
 * Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
 * Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40 ),
 * соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.
 * б) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда"
 * с методом "одетьЖенщину".
 * в) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
 * г) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда"
 * и "Женская Одежда"), Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
 * Юбка (реализует интерфейсы "Женская Одежда"), Галстук (реализует интерфейсы "Мужская Одежда").
 * д) Создать массив, содержащий все типы одежды.
 * Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину,
 * на вход которых будет поступать массив, содержащий все типы одежды.
 * Метод одетьЖенщину выводит на консоль всю информацию о женской одежде.
 * То же самое для метода одетьМужчину.
 */

public class ClothingDemo {
    public static void main(String[] args) {
        Clothing clothing = Clothing.M;
        System.out.println("Мой размер: " + clothing);
        print(clothing);
        print(Clothing.XXS);
        System.out.println();
        print();
    }

    public static void print(Clothing clothing) {
        switch (clothing) {
            case XXS:
                System.out.println(32);
                break;
            case XS:
                System.out.println(34);
                break;
            case S:
                System.out.println(36);
                break;
            case M:
                System.out.println(38);
                break;
            case L:
                System.out.println(40);
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void print() {
        Clothing[] clothing = Clothing.values();
        for (Clothing c : clothing) {
            System.out.println(c + " is " + c.getEuroSize()
                    + " Description: " + c.getDescription());
        }
    }
}
