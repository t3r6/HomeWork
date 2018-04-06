package com.lesson16;

import java.util.*;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Создать коллекцию, содержащую объекты класса Student.
 * Перебрать всех студентов, вычислить средний балл каждого студента.
 * Если средний балл >=3, студент переводится на следующий курс, иначе отчисляется.
 * Напишите метод printStudents(List students, int course), который получает список студентов и номер курса
 * и печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 * Для обхода списка в этом методе используйте итератор.
 */

public class Student {
    public static List<Student> students = new ArrayList<>();
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> marks;

    public Student(String name, String group, int course, Map<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(group, student.group) &&
                Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, group, course, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }


    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student s = studentIterator.next();
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static void checkForAverage() {
        for (Student s : students) {
            if (s.average() >= 3) {
                System.out.println(s.getName() + " passed");
            } else {
                System.out.println(s.getName() + " expelled");
            }
        }
    }

    public  static  void listAverage(){
        for (Student s : students) {
            System.out.println(s + " average: " + s.average());
        }
    }

    public int average() {
        int a = 0;
        for (Integer m : marks.values()) {
            a += m;
        }
        return a / marks.size();
    }

    public static void main(String[] args) {
        Map<String, Integer> marks1 = new HashMap<>(), marks2 = new HashMap<>(), marks3 = new HashMap<>();
        marks1.put("Math", 1);
        marks1.put("Phys", 2);
        marks1.put("Programming", 3);
        marks2.put("Math", 5);
        marks2.put("Phys", 4);
        marks2.put("Programming", 4);
        marks3.put("Math", 5);
        marks3.put("Phys", 5);
        marks3.put("Programming", 4);
        students.add(new Student("Adam", "A", 1, marks1));
        students.add(new Student("Bob", "B", 1, marks2));
        students.add(new Student("Andru", "C", 2, marks3));

        listAverage();
        checkForAverage();
        printStudents(students, 1);
        printStudents(students, 2);
    }
}
