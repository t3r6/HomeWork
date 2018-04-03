package com.lesson16;

public class HeavyBox1 extends Box6 implements Comparable<HeavyBox1> {
    public int weight; // вес коробки

    public HeavyBox1(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox1() {
        this.weight = -1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox1 anotherBox) {
        int parameter1 = anotherBox.getWeight();
        if (this.weight != parameter1) {
            return this.weight - parameter1;
        } else {
            if (this.getHeight() < anotherBox.getHeight())
                return -1;
            else if (anotherBox.getHeight() < this.getHeight())
                return 1;
            return 0;
        }
    }

    @Override
    public String toString() {
        return "HeavyBox1{" +
                "weight=" + weight +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", depth=" + getDepth() +
                "} ";
    }
}
