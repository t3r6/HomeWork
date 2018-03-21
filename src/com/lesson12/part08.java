package com.lesson12;

/**
 * Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part08 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*a*b");
        Matcher matcher = pattern.matcher("aaab");
        Matcher matcher1 = pattern.matcher("cab");
        Matcher matcher2 = pattern.matcher("ccab");
        Matcher matcher3 = pattern.matcher("cccb");

        Matcher[] matchers = new Matcher[]{matcher, matcher1, matcher, matcher3};
        for (Matcher m : matchers) {
            System.out.println(m.matches());
        }
    }
}
