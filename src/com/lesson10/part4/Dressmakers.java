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

public class Dressmakers implements MensClothing, WomensClothing {
    public void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MensClothing) {
                System.out.println(c);
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        for (Clothes d : clothes) {
            if (d instanceof WomensClothing) {
                System.out.println(d);
            }
        }
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWoman() {
    }
}
