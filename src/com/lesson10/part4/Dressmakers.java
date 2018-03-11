package com.lesson10.part4;

public class Dressmakers implements MensClothing, WomensClothing {
    @Override
    public void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MensClothing) {
                System.out.println(c.getClothingSize());
            }
        }
    }

    @Override
    public void dressWoman() {

    }

}
