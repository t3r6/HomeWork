package com.lesson14.part5;

/**
 * Создать интерфейс Cookable, содержащий метод void cook().
 * Создать класс Food, содержащий метод public void prepare(Cookable c) { c.cook(); }
 * Создать экземпляр класса Food и вызвать его метод prepare().
 * На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable.
 */

public class FoodDemo {
    public static void main(String[] args) {
        Food food = new Food();
        Food meat = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Delicious");
            }
        });
        meat.prepare(()-> System.out.println("Smells good!"));
    }
}
