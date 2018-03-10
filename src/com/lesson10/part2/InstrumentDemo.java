package com.lesson10.part2;

/**
 * Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
 * Интерфейс Инструмент содержит метод play() и клавишу String KEY = "До мажор".
 * Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
 * Создать массив типа Инструмент, содержащий инструменты разного типа.
 * В цикле вызвать метод play() для каждого инструмента,
 * который должен выводить строку "Играет такой-то инструмент c такими то характеристикам
 */

public class InstrumentDemo {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(7);
        Guitar guitar3 = new Guitar(12);
        Trumpet tube1 = new Trumpet(5);
        Trumpet tube2 = new Trumpet(6);
        Trumpet tube3 = new Trumpet(8);
        Drum drum1 = new Drum(34);
        Drum drum2 = new Drum(24);
        Drum drum3 = new Drum(28);

        Instrument[] instruments = {guitar1, guitar2, guitar3, tube1, tube2, tube3, drum1, drum2, drum3};

        for (Instrument i : instruments) {
            i.play();
        }
    }
}
