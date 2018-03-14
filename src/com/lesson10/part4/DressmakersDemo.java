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

public class DressmakersDemo {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt(Clothing.XXS, 11.2, "yellow", "Forward Point ");
        Tshirt tshirt2 = new Tshirt(Clothing.S, 13.5, "pink", "Button-Down");
        Tshirt tshirt3 = new Tshirt(Clothing.M, 19.0, "blue", "Spread");
        Pants pants1 = new Pants(Clothing.L, 50.6, "brown", 60.3);
        Pants pants2 = new Pants(Clothing.XS, 60.8, "white", 50.7);
        Pants pants3 = new Pants(Clothing.XXS, 68.5, "purple", 60.5);
        Skirt skirt1 = new Skirt(Clothing.M, 70.2, "black", 80);
        Skirt skirt2 = new Skirt(Clothing.L, 80.0, "red", 83);
        Skirt skirt3 = new Skirt(Clothing.XS, 70.2, "black", 85);
        Tie tie1 = new Tie(Clothing.L, 24.5, "orange", 50);
        Tie tie2 = new Tie(Clothing.M, 28.0, "green", 55);
        Tie tie3 = new Tie(Clothing.S, 30.5, "green", 45);

        Clothes[]clothes = {tshirt1, tshirt2, tshirt3, pants1, pants2, pants3, skirt1, skirt2, skirt3,
                tie1, tie2, tie3};

        /*Tshirt.dressMan();*/
    }
}
