package com.lesson12.part07;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report, который будет содержать статический метод generateReport,
 * в котором выводится информация о зарплате всех сотрудников. Используйте форматировании строк.
 * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой
 * и можете добавить что-нибудь свое.
 */

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Will Smith", "Manager",3300);
        Employee employee2 = new Employee("Arnold Schwarzenegger", "Consultant",4500);
        Employee employee3 = new Employee("Jean-Claude Van Damme", "Customer support",2100);

        Employee[] employees = new Employee[]{employee1, employee2, employee3};

        for (Employee e : employees) {
            System.out.println(e);
        }

        Report.generateReport(employees);
    }
}
