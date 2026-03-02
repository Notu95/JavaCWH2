package com.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest1 {
    public static void main(String[] args) {
        String str="My 1st name is Sourav and 2nd name is Ghosh  . 2345 My credit card number is 2345 9848 3475 3849 ";
        String[] strArr=str.split("[\\s+]");
//        String withOutSpace=str.replace(" ","");
//        System.out.println(withOutSpace);
//        Pattern pattern = Pattern.compile("\\b\\d{13,19}\\b"); // 13 to 19 digits
        Pattern pattern = Pattern.compile("(\\s\\d{4}){4}");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println("Found credit card number: " + matcher.group());
        }
    }

}
