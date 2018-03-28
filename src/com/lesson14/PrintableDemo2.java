package com.lesson14;
import com.lesson10.part1.Printable;

/**
 * Создать анонимный класс расширяющий интерфейс Printable. Вызвать его метод print().(Задание с урока)
 */

public class PrintableDemo2 {
    public static void main(String[] args){
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Print in color.");
            }
        };
        printable.print();
    }
}
