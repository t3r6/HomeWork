package com.lesson10.part3;

/**
 * а) Создать перечисление, содержащее названия времен года.
 * б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
 * в) Создать метод, который принимает на вход переменную созданного вами enum типа.
 * Если значение равно Лето, выводим на консоль “Я люблю лето” и т.д. Используем оператор switch.
 * г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * д) Добавить конструктор принимающий на вход среднюю температуру.
 * е) Создать метод getDescription, возвращающий строку “Холодное время года”.
 * Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
 * ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.  (Задание с урока)
 */

public enum Season {
    WINTER(-10), SPRING(20), SUMMER(25) {
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(15);

    Season(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}