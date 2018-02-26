package com.lesson7;

/**
 * Класс Phone. (Задание с урока)
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса.
 * в) Выведите на консоль значения их переменных.
 * г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * д) Добавить конструктор в класс Phone,
 * который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 * е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * ж) Добавить конструктор без параметров.
 * з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 * Вызвать этот метод.
 * к) Создать метод sendMessage  с аргументами переменной длины.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 * Метод выводит на консоль номера этих телефонов.
 */

public class Phone {
    String number /*= "+380507789456"*/;
    String model /*= "Samsung"*/;
    double weight /*= 40*/;

    Phone(String n, String w, double s) {
        this(n, w);
       /* number = n;
        model = w;*/
        weight = s;
    }

    Phone(String n, String w) {
        number = n;
        model = w;
    }

    Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номером телефона " + number);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String... array) {
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

