package com.lesson9.part1;

/**
 * Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
 * Класс Фрукт содержит:
 * a) переменную вес,
 * б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
 * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен
 * в каждом классе наследнике. Метод должен учитывать вес фрукта.
 * Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов.
 * А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */

import java.text.*;

public class Price {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Fruit apple1 = new Apple(0.25, 4.5);
        Fruit apple2 = new Apple(0.3, 3.5);
        Fruit apple3 = new Apple(0.35, 3.0);
        Fruit pear1 = new Pear(0.45, 3.8);
        Fruit pear2 = new Pear(0.4, 4.2);
        Fruit pear3 = new Pear(0.5, 4.5);
        Fruit apricot1 = new Apricot(3.2, 6);
        Fruit apricot2 = new Apricot(2.4, 5);
        Fruit apricot3 = new Apricot(2.3, 4.5);

        Fruit[] fruits = {apple1, apple2, apple3, apricot1, apricot2, apricot3, pear1, pear2, pear3};
        double fullFruitPrice = 0;
        for (Fruit fruits1 : fruits) {
            fullFruitPrice += fruits1.cost(fruits1);
        }
        System.out.println("Стоимость всех фруктов " + (df.format(fullFruitPrice)));

        Fruit[] apples = {apple1, apple2, apple3};
        double applesPrice = 0;
        for (Fruit apples1 : apples) {
            applesPrice += apples1.cost(apples1);
        }
        System.out.println("Стоимость всех яблок " + (df.format(applesPrice)));

        Fruit[] pears = {pear1, pear2, pear3};
        double pearsPrice = 0;
        for (Fruit pears1 : pears) {
            pearsPrice += pears1.cost(pears1);
        }
        System.out.println("Стоимость всех груш " + (df.format(pearsPrice)));

        Fruit[] apricots = {apricot1, apricot2, apricot3};
        double apricotsPrice = 0;
        for (Fruit apricots1 : apricots) {
            apricotsPrice += apricots1.cost(apricots1);
        }
        System.out.println("Стоимость всех абрикос " + (df.format(apricotsPrice)));

        Fruit.printManufacturerInfo();
    }
}

