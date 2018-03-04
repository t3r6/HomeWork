package com.lesson8.part2;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Aspirant("Вася", "Галушкин", "666", 2.5, "HellResearch");
        Student student1 = new Student("Андрей", "Петрович", "52", 4.0);
        Aspirant student2 = new Aspirant("Оксана", "Васильева", "69", 5.0, "Deep Knowledge");
        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAvrMark());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getAvrMark());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getAvrMark() + " " + student2.getScienceWork());

        Student[] obj = {student, student1, student2};
        for (Student a : obj) {
            System.out.println(a.getScholarship());
        }
    }
}
