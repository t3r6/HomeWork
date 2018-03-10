package com.lesson09.part3;

import java.text.*;

/**
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * - константу PI.
 * Создать несколько объектов данного класса.
 */

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle(10);
        Circle circle4 = new Circle(8);
        Circle circle5 = new Circle(9);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Площадь первого круга " + circle1.area() +
                ", Длина окружности " + circle1.circuit());
        System.out.println("Площадь второго круга " + circle2.area() +
                ", Длина окружности " + circle2.circuit());
        System.out.println("Площадь третьего круга " + circle3.area() +
                ", Длина окружности " + (df.format(circle3.circuit())));
        System.out.println("Площадь четвёртого круга " + circle4.area() +
                ", Длина окружности " + circle4.circuit());
    }
}
