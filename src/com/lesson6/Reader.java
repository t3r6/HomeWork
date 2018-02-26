package com.lesson6;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг.
 * Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг.
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book
 * (создать новый класс, содержащий имя и автора книги).
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook().
 * Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
 * Или  "Петров В. В. вернул 3 книги".
 */

public class Reader {
    private String fullName, department, birthDay, phoneNumber;
    private int id;

    Reader() {
    }

    Reader(String fullName, int id, String department, String birthDay, String phoneNumber) {
        this.fullName = fullName;
        this.id = id;
        this.department = department;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    void takeBook() {
        System.out.println(fullName + " взял 3 книги!");
    }

    void takeBook(String... titles) {
        System.out.print(fullName + " взял книги: ");
        for (String a : titles) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book ex : books) {
            System.out.print(ex.getName() + ", " + ex.getWriter() + "; ");
        }
        System.out.println();
    }

    void returnBook() {
        System.out.println(fullName + " вернул 3 книги!");
    }

    void returnBook(String... titles) {
        System.out.print(fullName + " вернул книги: ");
        for (String a : titles) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book ex : books) {
            System.out.print(ex.getName() + ", " + ex.getWriter() + "; ");
        }
        System.out.println();
    }
}

