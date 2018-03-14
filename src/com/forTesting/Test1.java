package com.forTesting;

class Test1 {
    int a;	// доступ, определенный по умолчанию
    public int b;	// общедоступный доступ
    private int с; // приватный доступ
    // методы доступа к с
    void setc(int i) {
// установка значения переменной с
        с = i;
    }
    int getc() {
// получение значения переменной с
        return с;
    }}