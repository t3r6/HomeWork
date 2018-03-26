package com.lesson13;

/*import com.lesson12.part07.Employee;*/

import java.util.Arrays;

/**
 * Напишите программу, выводящую на консоль всю метаинформацию о выбранном классе.
 */

public class Part5 {
    public static void reflection (Class aClass) {
        System.out.println(aClass.getClass());
        System.out.println(aClass.getSuperclass());
        System.out.println(aClass.getPackage());
        System.out.println(aClass.getModifiers());
        System.out.println(aClass.isArray());
        System.out.println(aClass.isInterface());
        System.out.println(aClass.isPrimitive());
        System.out.println(Arrays.deepToString(aClass.getDeclaredClasses()));
        System.out.println(Arrays.deepToString(aClass.getDeclaredMethods()));
        System.out.println(Arrays.deepToString(aClass.getDeclaredConstructors()));
        System.out.println(Arrays.deepToString(aClass.getDeclaredFields()));
        System.out.println(Arrays.deepToString(aClass.getClasses()));
        System.out.println(Arrays.deepToString(aClass.getConstructors()));
        System.out.println(Arrays.deepToString(aClass.getMethods()));
        System.out.println(Arrays.deepToString(aClass.getFields()));
    }

    public static void main(String[] args) {
        reflection (com.lesson12.part07.Employee.class);
        System.out.println();
        reflection(FullReport.class);
    }
}
