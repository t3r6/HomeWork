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

public interface Printable {
    void print();
}
