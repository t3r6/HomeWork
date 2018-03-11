package com.lesson10.part4;

public class DressmakersDemo {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt(34, 11.2, "yellow", "Forward Point ");
        Tshirt tshirt2 = new Tshirt(36, 13.5, "pink", "Button-Down");
        Tshirt tshirt3 = new Tshirt(38, 19.0, "blue", "Spread");
        Pants pants1 = new Pants(40, 50.6, "brown", 60.3);
        Pants pants2 = new Pants(32, 60.8, "white", 50.7);
        Pants pants3 = new Pants(34, 68.5, "purple", 60.5);
        Skirt skirt1 = new Skirt(36, 70.2, "black", 80);
        Skirt skirt2 = new Skirt(34, 80.0, "red", 83);
        Skirt skirt3 = new Skirt(36, 70.2, "black", 85);
        Tie tie1 = new Tie(38, 24.5, "orange", 50);
        Tie tie2 = new Tie(36, 28.0, "green", 55);
        Tie tie3 = new Tie(34, 30.5, "green", 45);

        Clothes[]clothes = {tshirt1, tshirt2, tshirt3, pants1, pants2, pants3, skirt1, skirt2, skirt3,
                tie1, tie2, tie3};

        /*Tshirt.dressMan();*/
    }
}
