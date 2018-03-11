package com.lesson10.part4;

import java.util.Objects;

public class Pants extends Clothes implements MensClothing, WomensClothing {
    private double legLength;

    public Pants(int clothingSize, double price, String color, double legLength) {
        super(clothingSize, price, color);
        this.legLength = legLength;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
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
        Pants pants = (Pants) o;
        return Double.compare(pants.legLength, legLength) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), legLength);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "legLength=" + legLength +
                '}';
    }
}
