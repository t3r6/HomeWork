package com.lesson07;

import java.util.Objects;

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

/**
 * Доделать класс Phone. (Задание с урока)
 * и) Изменить класс Phone в соответствии с концепцией JavaBean.
 * к) Реализовать подсчет количества существующих телефонов с помощью статической переменной.
 */

public class Phone {
    private static int count;
    private String number /*= "+380507789456"*/;
    private String model /*= "Samsung"*/;
    private double weight /*= 40*/;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Phone.count = count;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(String n, String w, double s) {
        this(n, w);
       /* number = n;
        model = w;*/
        weight = s;
    }

    public Phone(String n, String w) {
        number = n;
        model = w;
        count++;
    }

    public Phone() {
        count++;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номером телефона " + number);
    }

    public void sendMessage(String... array) {
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.weight, weight) == 0 &&
                Objects.equals(number, phone.number) &&
                Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, model, weight);
    }

}

