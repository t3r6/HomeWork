package com.lesson10.part4;

import java.util.Objects;

public class Skirt extends Clothes implements WomensClothing {
    private double skirtLength;

    public Skirt(int clothingSize, double price, String color, double skirtLength) {
        super(clothingSize, price, color);
        this.skirtLength = skirtLength;
    }

    public double getSkirtLength() {
        return skirtLength;
    }

    public void setSkirtLength(double skirtLength) {
        this.skirtLength = skirtLength;
    }

    @Override
    public void dressWoman() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Skirt skirt = (Skirt) o;
        return Double.compare(skirt.skirtLength, skirtLength) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), skirtLength);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "skirtLength=" + skirtLength +
                '}';
    }
}
