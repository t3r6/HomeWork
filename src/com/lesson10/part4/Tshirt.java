package com.lesson10.part4;

import java.util.Objects;

public class Tshirt extends Clothes implements MensClothing, WomensClothing {
    private String collarStyle;

    public Tshirt(int clothingSize, double price, String color, String collarStyle) {
        super(clothingSize, price, color);
        this.collarStyle = collarStyle;
    }

    public String getCollarStyle() {
        return collarStyle;
    }

    public void setCollarStyle(String collarStyle) {
        this.collarStyle = collarStyle;
    }

    @Override
    public void dressMan(Clothes[]clothes) {

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tshirt tshirt = (Tshirt) o;
        return Objects.equals(collarStyle, tshirt.collarStyle);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), collarStyle);
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "collarStyle='" + collarStyle + '\'' +
                '}';
    }
}
