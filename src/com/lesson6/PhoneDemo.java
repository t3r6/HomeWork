package com.lesson6;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+380677596281", "Lenovo", 30);
        Phone phone2 = new Phone("+380957593132", "Motorolla", 25);
        Phone phone3 = new Phone("+380634398439", "Nokia", 35);

        System.out.println("Номер: " + phone1.number + " модель " + phone1.model + " вес " + phone1.weight);
        System.out.println("Номер: " + phone2.number + " модель " + phone2.model + " вес " + phone2.weight);
        System.out.println("Номер: " + phone3.number + " модель " + phone3.model + " вес " + phone3.weight);
        System.out.println();
        phone1.receiveCall("Мама", "+380668542168");
        phone1.receiveCall("Мама");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Андрей", "+380985214863");
        phone2.receiveCall("Андрей");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Анастасия", "+380996523418");
        phone3.receiveCall("Анастасия");
        System.out.println(phone3.getNumber());

        phone1.sendMessage(new String[]{});
        phone2.sendMessage(new String[]{"+380986523468"});
        phone3.sendMessage(new String[]{"+380936523424","+380475843621","+380669852147"});
    }
}
