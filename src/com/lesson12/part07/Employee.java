package com.lesson12.part07;

import java.util.Date;
import java.util.Objects;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report, который будет содержать статический метод generateReport,
 * в котором выводится информация о зарплате всех сотрудников. Используйте форматировании строк.
 * Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой
 * и можете добавить что-нибудь свое.
 */

public class Employee {
    private String fullName;
    private String position;
    private double salary;
    private Date salaryDate;

    public Employee() {
    }

    public Employee(String fullName, String position, double salary, Date salaryDate) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(fullName, employee.fullName) &&
                Objects.equals(position, employee.position) &&
                Objects.equals(salaryDate, employee.salaryDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, position, salary, salaryDate);
    }


    @Override
    public String toString() {
        return String.format("Employee %s obtains %s position and gets %.2f salary", fullName, position, salary);
    }
}
