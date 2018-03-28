package com.lesson14;

/**
 * Создать класс User, содержащий private переменные login, password.
 * Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(),
 * который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем отправил запрос.
 * Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
 * В методе main(): создать экземпляр класса User и вызвать метод createQuery();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
 * создать экземпляр класса Query и вызвать метод printToLog()
 * используя конструкцию new User().new Query(); (Задание с урока)
 */

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь %s с паролем " + "%s отправил запрос \n", login, password);
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Andy", "password");
        User user2 = new User("John", "qwerty");
        user1.createQuery();
        user2.createQuery();
        User.Query query1 = user1.new Query();
        query1.printToLog();
        User.Query query2 = new User("Ben", "111").new Query();
        query2.printToLog();
        User.Query query3 = user2.new Query();
        query3.printToLog();
    }
}
