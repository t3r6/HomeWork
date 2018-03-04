package com.company.vehicles;

import java.util.Objects;

public class SportCar extends Car{
    private double maxSpeed;

    public SportCar(String model, String classification, double weight, String name, int drivingExperience,
                    double power, String manufacturer, double maxSpeed) {
        super(model, classification, weight, name, drivingExperience, power, manufacturer);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return Double.compare(sportCar.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
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
        System.out.println("Max Speed: " + this.getMaxSpeed());
        System.out.println();
    }
}
