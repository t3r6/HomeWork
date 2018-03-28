package com.lesson14;

/**
 *Переписать класс Query используя статический класс. (Задание с урока)
 */

public class User3 {
    private static String login, password;

    static {
        login = "login";
        password = "password";
    }

    public User3() {
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User3{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    static class Query {
        public void printToLog() {
            System.out.printf("User %s with password %s has send a query.\n", login, password);
        }
    }

    public static void main(String[] args) {
        User3.Query query1 = new User3.Query();
        query1.printToLog();

        Query query2 = new Query();
        query2.printToLog();
    }
}