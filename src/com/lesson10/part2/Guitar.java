package com.lesson10.part2;

import java.util.Objects;

/**
 * Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
 * Интерфейс Инструмент содержит метод play() и клавишу String KEY = "До мажор".
 * Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
 * Создать массив типа Инструмент, содержащий инструменты разного типа.
 * В цикле вызвать метод play() для каждого инструмента,
 * который должен выводить строку "Играет такой-то инструмент c такими то характеристикам
 */

public class Guitar implements Instrument {
    private int stringQuantity;

    public Guitar(int stringQuantity) {
        this.stringQuantity = stringQuantity;
    }

    public int getStringQuantity() {
        return stringQuantity;
    }

    public void setStringQuantity(int stringQuantity) {
        this.stringQuantity = stringQuantity;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + getStringQuantity() + " струнами");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return stringQuantity == guitar.stringQuantity;
    }

    @Override
    public int hashCode() {

        return Objects.hash(stringQuantity);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "stringQuantity=" + stringQuantity +
                '}';
    }
}
