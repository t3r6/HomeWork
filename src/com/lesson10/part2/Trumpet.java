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

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + getDiameter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return diameter == trumpet.diameter;
    }

    @Override
    public int hashCode() {

        return Objects.hash(diameter);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
