package com.lesson10.part4;

import java.util.Objects;

public class Tie extends Clothes implements MensClothing {
    private double tieLength;

    public Tie(int clothingSize, double price, String color, double tieLength) {
        super(clothingSize, price, color);
        this.tieLength = tieLength;
    }

    public double getTieLength() {
        return tieLength;
    }

    public void setTieLength(double tieLength) {
        this.tieLength = tieLength;
    }

    @Override
    public void dressMan(Clothes[]clothes) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tie tie = (Tie) o;
        return Double.compare(tie.tieLength, tieLength) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), tieLength);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "tieLength=" + tieLength +
                '}';
    }
}
