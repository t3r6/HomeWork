package com.lesson12;

/**
 * Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*a*b");
        Matcher matcher = pattern.matcher("aaab");
        Matcher matcher1 = pattern.matcher("cab");
        Matcher matcher2 = pattern.matcher("ccab");
        Matcher matcher3 = pattern.matcher("cccb");
        boolean a = matcher.matches();
        boolean b = matcher1.matches();
        boolean c = matcher2.matches();
        boolean d = matcher3.matches();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
