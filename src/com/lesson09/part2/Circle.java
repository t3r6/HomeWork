package com.lesson09.part2;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw).
 * Добавить метод equals()  для классов Shape, Circle, Rectangle. (Задание с урока)
 */

public class Circle extends Shape {
    private int R;
    private int x;
    private int y;

    public Circle(String color, int r, int x, int y) {
        super(color);
        R = r;
        this.x = x;
        this.y = y;
    }

    public int getR() {
        return R;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setR(int r) {
        R = r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисую круг " + getColor() + " цвета");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (R != circle.R) return false;
        if (x != circle.x) return false;
        return y == circle.y;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + R;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                ", x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }
}