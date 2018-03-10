package com.lesson10.part1;

/**
 * а) Определить интерфейс Printable, содержащий метод void print().
 * б) Определить класс Book, реализующий интерфейс Printable.
 * в) Определить класс Magazine, реализующий интерфейс Printable.
 * г) Создать массив типа Printable, который будет содержать книги и журналы.
 * д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 * е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
 * который выводит на консоль названия только журналов.
 * Создать статический метод printBooks(Printable[] printable)в классе Book,
 * который выводит на консоль названия только книг. Используем оператор instanceof. (Задание с урока)
 */

import java.util.Objects;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаю журнал " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable a : printable) {
            if (a instanceof Magazine) {
                System.out.println(((Magazine) a).getName());
            }
        }
    }
}
