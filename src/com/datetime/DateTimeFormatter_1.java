package com.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatter_1 {
    public static void main(String[] args) {
        LocalDateTime dt3=LocalDateTime.now();//This is the date
        System.out.println(dt3);

        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd-MM-yyyy   |  E | EEEE |EEEEE");//this is the format// mm--> used for minute
        DateTimeFormatter df2=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT);
        DateTimeFormatter df3=DateTimeFormatter.ISO_LOCAL_DATE;// follow java 17 docs


        String mydate=dt3.format(df1);//Creating dateTime string
        System.out.println(mydate);
        System.out.println(dt3.format(df3));
        System.out.println(dt3.format(df2));
        //System.out.println(mydate);
    }
}
