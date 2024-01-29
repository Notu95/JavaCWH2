package com.company1;

import java.io.IOException;
import java.sql.SQLOutput;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr={100,0};
        try {
            System.out.println(" Dividend is  " + (arr[0]/arr[1]));
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Divisor cant be Zero");
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            //System.out.println("Divisor cant be Zero");
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Divisor cant be Zero");
        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//            System.out.println("Divisor cant be Zero");
//            System.out.println("ArithmeticException");
//        }
    }
}
