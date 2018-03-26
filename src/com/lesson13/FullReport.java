package com.lesson13;

import com.lesson12.part07.Employee;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Добавить переменную Date salaryDate в класс Employee из предыдущего урока.
 * Создать класс FullReport, который выводит ту же информацию, что и Report из предыдущего урока,
 * и добавляет дату выдачи зарплаты. Использовать классы NumberFormat и DateFormat.
 * Заголовок отчета должен изменяться в зависимости от выбранной локали (используем класс ResourceBundle).
 */

public class FullReport {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee employee1 = new Employee("Will Smith", "Manager", 3300,
                new GregorianCalendar(2018, 3, 30).getTime());
        Employee employee2 = new Employee("Arnold Schwarzenegger", "Consultant", 4500,
                new GregorianCalendar(2018, 3, 29).getTime());
        Employee employee3 = new Employee("Jean-Claude Van Damme", "Customer support", 2100,
                new GregorianCalendar(2018, 3, 28).getTime());

        Employee[] employees = new Employee[]{employee1, employee2, employee3};

        Locale us = Locale.US;
        generateReport(employees, us);

        Locale current = Locale.getDefault();
        generateReport(employees, current);

        Locale ua = new Locale("uk", "UA");
        generateReport(employees, ua);
    }

    public static void generateReport(Employee[] employees, Locale current)
            throws UnsupportedEncodingException {
        ResourceBundle rb = ResourceBundle.getBundle("report", current);
        String s1 = rb.getString("heading");
        s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s1);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        NumberFormat nf = NumberFormat.getCurrencyInstance(current);
        for (Employee employee : employees) {
            System.out.printf("%S получает %s в дату %s%n",
                    employee.getFullName(), nf.format(employee.getSalary()),
                    df.format(employee.getSalaryDate()));
        }
    }
}

