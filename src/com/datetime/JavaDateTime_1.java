package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class JavaDateTime_1 {
    public static void main(String[] args) {
        //Date Class
        /*
        {int yr=0;
        long miliSec=System.currentTimeMillis();
        long sec= miliSec/1000;
        long hour=sec/3600;
        long day=hour/24;
        yr= (int) (day/365);

        System.out.println(System.currentTimeMillis());
        System.out.println(yr);

        Date d=new Date();//almost deprecated
        System.out.println(d);

        Date d1=new Date(169329969850l);//almost deprecated
        System.out.println(d1);}
        */


        //Calendar
        /*
        {//Calendar c=Calendar.getInstance();
        Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Dhaka"));

        System.out.println(c.getCalendarType());
        System.out.println(c);
        System.out.println(c.getTimeZone().getID());

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));;

        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[270]);
        System.out.println(gc.isLeapYear(2018));}
        */

        //java.Time
        /*
        {LocalDate d2=LocalDate.now();
        LocalTime t2=LocalTime.now();
        System.out.println(d2+"    "+t2);

        LocalDateTime dt2=LocalDateTime.now();
        System.out.println(dt2);}
        */

    }
}
