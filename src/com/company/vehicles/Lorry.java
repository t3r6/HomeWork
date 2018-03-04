package com.company.vehicles;

import java.util.Objects;

public class Lorry extends Car{
    private double loadCapacity;

    public Lorry(String model, String classification, double weight, String name, int drivingExperience,
                 double power, String manufacturer, double loadCapacity) {
        super(model, classification, weight, name, drivingExperience, power, manufacturer);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return Double.compare(lorry.loadCapacity, loadCapacity) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "loadCapacity=" + loadCapacity +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void printInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Class: " + this.getClassification());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Driver: " + this.getDriver().getName());
        System.out.println("Driving experience: " + this.getDriver().getDrivingExperience());
        System.out.println("Engine power: " + this.getEngine().getPower());
        System.out.println("Engine manufacturer: " + this.getEngine().getManufacturer());
        System.out.println("Load capacity: " + this.getLoadCapacity());
        System.out.println();
    }
}
