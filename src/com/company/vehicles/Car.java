package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

import java.util.Objects;

public class Car {
    private String model;
    private String classification;
    private double weight;
    Driver driver = new Driver("Default", 00);
    Engine engine = new Engine(0.00, "Default");

    public Car(String model, String classification, double weight, String name,
               int drivingExperience, double power, String manufacturer) {
        this.model = model;
        this.classification = classification;
        this.weight = weight;
        this.driver = new Driver(name, drivingExperience);
        this.engine = new Engine (power, manufacturer);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.weight, weight) == 0 &&
                Objects.equals(model, car.model) &&
                Objects.equals(classification, car.classification) &&
                Objects.equals(driver, car.driver) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {

        return Objects.hash(model, classification, weight, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", classification='" + classification + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево!");
    }

    public void turnRight() {
        System.out.println("Поворот направо!");
    }

    public void printInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Class: " + this.getClassification());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Driver: " + this.getDriver().getName());
        System.out.println("Driving experience: " + this.getDriver().getDrivingExperience());
        System.out.println("Engine power: " + this.getEngine().getPower());
        System.out.println("Engine manufacturer: " + this.getEngine().getManufacturer());
        System.out.println();
    }


 /*   public static void main(String[] args) {
        com.company.details.Engine Engine = new com.company.details.Engine();
        com.company.professions.Driver Driver = new com.company.professions.Driver();
        for (String str : args) {
            System.out.println("I'm driving " + str);
        }
    }*/
}
