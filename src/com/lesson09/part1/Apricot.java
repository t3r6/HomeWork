package com.lesson09.part1;

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

public class Apricot extends Fruit{
    public Apricot(double weight, double price) {
        super(weight, price);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double cost(Fruit fruit) {
        return (getWeight() * getPrice());
    }
}
