package com.lesson07;

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

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader("Петров В. В.", 5, "технологический",
                "07 февраля 1986", "+380502419568");
        Reader reader3 = new Reader("Васильев А.К.", 8, "физико-математический",
                "15 марта 1989", "+380980532130");
        Reader[] array = {reader1, reader2, reader3};

        Book example1 = new Book("Naked Lunch", "William S. Burroughs");
        Book example2 = new Book("An American Tragedy", "Theodore Dreiser");
        Book example3 = new Book("The Dweller in the Gulf", "Clark Ashton Smith");

        reader2.takeBook();
        reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader3.takeBook("Ten Little Indians", "Harry Potter and the Philosopher's Stone");
        reader3.takeBook(example1, example2);
        reader2.returnBook();
        reader2.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader3.returnBook("Ten Little Indians", "Harry Potter and the Philosopher's Stone");
        reader3.returnBook(example1, example2);
    }
}
