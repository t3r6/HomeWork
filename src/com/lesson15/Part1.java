package com.lesson15;

import com.lesson08.part5.Animal;

import java.io.Serializable;
import java.util.Objects;

/**
 * а) Создать обобщенный класс с тремя параметрами (T, V, K).
 * Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
 * методы возвращающие значения трех переменных.
 * Создать метод, выводящий на консоль имена классов для трех переменных класса.
 * б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable,
 * V должен реализовать интерфейс Serializable и расширять класс Animal,
 * K должен расширять класс Number. (Задание с урока)
 */

public class Part1<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public Part1(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    void showTypes() {
        System.out.println("Type of T is "
                + ob1.getClass().getName());

        System.out.println("Type of V is "
                + ob2.getClass().getName());

        System.out.println("Type of K is "
                + ob3.getClass().getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part1<?, ?, ?> part1 = (Part1<?, ?, ?>) o;
        return Objects.equals(ob1, part1.ob1) &&
                Objects.equals(ob2, part1.ob2) &&
                Objects.equals(ob3, part1.ob3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ob1, ob2, ob3);
    }

    @Override
    public String toString() {
        return "Part1{" +
                "ob1=" + ob1 +
                ", ob2=" + ob2 +
                ", ob3=" + ob3 +
                '}';
    }

    public static void main(String[] args) {
        Part1<String, Animal, Double> part1 = new Part1<>("Hello", new Animal(), 2.55);
        part1.showTypes();
    }
}
