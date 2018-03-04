package com.company.professions;

import java.util.Objects;

public class Driver {
    private String name;
    private int drivingExperience;

    public Driver(String name, int drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingExperience == driver.drivingExperience &&
                Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, drivingExperience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
