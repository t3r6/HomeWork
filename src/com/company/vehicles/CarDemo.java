package com.company.vehicles;

import com.company.professions.Person;


public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Sedan", 3.197,
                "Michael Schumacher", 24, 6.000, "Volkswagen Group");
        Car car2 = new Lorry("Freightliner M2", "Truck", 66.000,
                "Bob", 32, 200, "Freightliner Trucks", 2000);
        Car car3 = new SportCar("HURACÁN SPYDER", "Sports Car", 3.400,
                "Peter Walker", 21, 8.250, "Automobili Lamborghini S.p.A.",
                324);
        Person person = new Person("Vova Sedoi", 15, 59);

        Car[] a = {car1, car2, car3};
        for (Car b : a) {
            b.printInfo();
        }
        person.printInfo();
        car1.start();
        car1.stop();
        car1.turnLeft();
        car1.turnRight();
    }
}
