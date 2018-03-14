package com.forTesting;

class AccessTest {
    public static void main(String args[]) {
        Test1 ob = new Test1();
// Эти операторы правильны, а и b доступны непосредственно
        ob.a = 10;
        ob.b = 20;
// Этот оператор неверен и может вызвать ошибку
 //ob.c = 100;
// Ошибка!
// Доступ к объекту с должен осуществляться посредством методов его класса
        ob.setc(100) ;
// OK
        System.out.println ("a, b, и с: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
