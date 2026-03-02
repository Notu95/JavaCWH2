package com.pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String str="My name is Sourav Ghosh. Whats yours?";

        String[] strArr=str.split("\\s+");

        ArrayList<String> arrList =new  ArrayList<>(Arrays.asList(strArr));
        String MyName=arrList.get(3)+" "+arrList.get(4);
//1
        System.out.println(MyName);
        //2
        StringBuilder sb=new StringBuilder();



        for (String part : strArr) {
            System.out.println(part);
        }
        for ( String strr : arrList){
            System.out.println(strr);
        }


    }
}
