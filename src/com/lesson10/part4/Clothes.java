package com.lesson10.part4;

import java.util.Objects;

public abstract class Clothes {
    private int clothingSize;
    private double price;
    private String color;

    public Clothes(int clothingSize, double price, String color) {
        this.clothingSize = clothingSize;
        this.price = price;
        this.color = color;
    }

    public int getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(int clothingSize) {
        this.clothingSize = clothingSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return clothingSize == clothes.clothingSize &&
                Double.compare(clothes.price, price) == 0 &&
                Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(clothingSize, price, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "clothingSize=" + clothingSize +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
