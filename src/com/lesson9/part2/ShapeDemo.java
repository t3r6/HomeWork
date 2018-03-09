package com.lesson9.part2;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw).
 * Добавить метод equals()  для классов Shape, Circle, Rectangle. (Задание с урока)
 */

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("yellow", 5, 5, 5);
        Rectangle rectangle = new Rectangle("green", 6, 8);
        System.out.println(circle);
        System.out.println(rectangle);
        Shape[] figures = {circle, rectangle};
        for (Shape a : figures) {
            a.draw();
        }
    }
}