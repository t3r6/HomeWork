package com.lesson09.part3;

/**
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * - константу PI.
 * Создать несколько объектов данного класса.
 */

public class Circle {
    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public double area() {
        return ((radius * radius) * PI);
    }

    public double circuit() {
        return (2 * PI * radius);
    }
}
