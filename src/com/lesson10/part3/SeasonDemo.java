package com.lesson10.part3;

/**
 * а) Создать перечисление, содержащее названия времен года.
 * б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
 * в) Создать метод, который принимает на вход переменную созданного вами enum типа.
 * Если значение равно Лето, выводим на консоль “Я люблю лето” и т.д. Используем оператор switch.
 * г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * д) Добавить конструктор принимающий на вход среднюю температуру.
 * е) Создать метод getDescription, возвращающий строку “Холодное время года”.
 * Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
 * ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.  (Задание с урока)
 */

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println("Мое любимое время года: " + season);
        System.out.println();
        print(season);  //Season.SUMMER default
        print(Season.AUTUMN);
        System.out.println();
        Season myFavSeason = Season.valueOf("AUTUMN");
        System.out.println("My favourite season is " + myFavSeason);
        System.out.println();
        System.out.println("Времена года: ");
        print();
    }

    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Люблю зиму");
                break;
            case SPRING:
                System.out.println("Люблю весну");
                break;
            case SUMMER:
                System.out.println("Люблю лето");
                break;
            case AUTUMN:
                System.out.println("Люблю осень");
                break;
            default:
                System.out.println("Ошибка");
        }
    }

    public static void print() {
        Season[] values = Season.values();
        for (Season season : values) {
            System.out.println(season + " average temperature: " + season.getTemperature()
                    + " Description: " + season.getDescription());
        }
    }
}
