package com.company.vehicles;

public class Car {
    public static void main(String[] args) {
        com.company.details.Engine Engine = new com.company.details.Engine();
        com.company.professions.Driver Driver = new com.company.professions.Driver();
        for (String str : args) {
            System.out.println("I'm driving " + str);
        }
    }
}
