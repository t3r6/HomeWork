package com.lesson16.part09;

import java.util.Objects;

/**
 * Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен игрушек  - keySet().
 * Перебрать и распечатать значения игрушек - values().
 * Для каждого перебора создать свой метод. (Задание с урока)
 */

public class Toy {
    private String name;
    private double cost;

    public Toy(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Toy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Double.compare(toy.cost, cost) == 0 &&
                Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
