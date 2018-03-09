package com.lesson9.part2;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw).
 * Добавить метод equals()  для классов Shape, Circle, Rectangle. (Задание с урока)
 */

public abstract class Shape {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
