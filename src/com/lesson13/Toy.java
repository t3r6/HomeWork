package com.lesson13;

public class Toy {
    private String name;
    private double price;
    private String action;
    static int count = 0;

    public Toy(String name, double price, String action) {
        this.name = name;
        this.price = price;
        this.action = action;
        count++;
    }

    public Toy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Toy.count = count;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private static double getP(Toy[] array) {
        double p = 0;
        for (Toy t : array) {
            p += t.getPrice();
        }
        return p;
    }

    public void play() {
        System.out.println(getAction());
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy("Cube", 13.50, "Play");
        Toy toy2 = new Toy("Box", 15.50, "Kick");
        Toy toy3 = new Toy("Gun", 11.00, "Shoot");
        Toy toy4 = new Toy("Hat", 20.50, "Wear");
        Toy[] array = {toy1, toy2, toy3, toy4};
        double p = getP(array);
        System.out.println("Price: " + p);
        System.out.println("Number: " + count);
        for (Toy t : array) {
            t.play();
        }
    }
}
