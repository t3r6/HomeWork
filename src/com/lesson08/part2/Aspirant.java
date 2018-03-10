package com.lesson08.part2;

/**
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant,
 * аспирант отличается от студента наличием некой научной работы.
 * а) Класс Student содержит переменные: String firstName, lastName, group.
 * А также  double averageMark, содержащую среднюю оценку.
 * б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 * в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
 * Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
 * Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
 * г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызвать метод getScholarship() для каждого элемента массива.  (Задание с урока)
 */

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double avrMark, String scienceWork) {
        super(firstName, lastName, group, avrMark);
        this.scienceWork = scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public int getScholarship() {
        if (getAvrMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
