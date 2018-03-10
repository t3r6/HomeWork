package com.lesson08.part5;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
 * Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
 * Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару.
 */

public class AnimalDemo {
    public static void main(String[] args) {
        /*Veterinarian vet = new Veterinarian();*/
        Dog d = new Dog("Dog", "meat", "Kiev", "German Shepherd");
        Cat c = new Cat("Cat", "meat", "Kharkov", "British Shorthair");
        Horse h = new Horse("Horse", "grass", "Odessa", "Thoroughbred");

        Animal[] animals = {d, c, h};

        for (Animal animals1 : animals) {
            Veterinarian.treatAnimal(animals1);
        }

        System.out.println();
        h.makeNoise();
        h.eat();
        h.sleep();
        c.makeNoise();
        c.eat();
        c.sleep();
        d.makeNoise();
        d.eat();
        d.sleep();
    }
}
