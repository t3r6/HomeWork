package com.lesson14;

/**
 * Переписать предыдущее задание, используя локальный класс. (Задание с урока)
 */

public class User2 {
    private String login;
    private String password;

    public User2(String login, String password) {
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
        class Query {
            public void printToLog() {
                System.out.printf("Пользователь %s с паролем " + "%s отправил запрос \n", login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }


    public static void main(String[] args) {
        User user1 = new User("Andy", "password");
        User user2 = new User("John", "qwerty");
        user1.createQuery();
        User.Query query1 = user1.new Query();
        query1.printToLog();
        User.Query query2 = new User("Ben", "111").new Query();
        query2.printToLog();
    }
}
