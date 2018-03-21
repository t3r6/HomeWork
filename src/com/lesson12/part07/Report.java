package com.lesson12.part07;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report, который будет содержать статический метод generateReport,
 * в котором выводится информация о зарплате всех сотрудников. Используйте форматировании строк.
 * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой
 * и можете добавить что-нибудь свое.
 */

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee e : employees) {
            System.out.printf("Employee %-25s gets %10.2f per month.\n", e.getFullName(), e.getSalary());
        }
    }
}
