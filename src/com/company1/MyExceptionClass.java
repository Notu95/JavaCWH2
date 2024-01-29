package com.company1;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number, if the number is greater than 10 then it will throw an exception");
         int i =sc.nextInt();
         if(i>10){
             try {
                 //throw new ExceptionClass();
                 throw new ArithmeticException("This is an exception");
             }
             catch(Exception e){
                // System.out.println(e);
                 System.out.println(e.getMessage());
                 System.out.println(e.toString());
                 e.printStackTrace();

             }
         }
    }

}

class ExceptionClass extends Exception{
    @Override
    public String toString(){
        return super.toString()+ "I am toString";
    }
    @Override
    public String getMessage(){
        return /*super.getMessage()+*/"I am GetMessage";
    }
//    @Override
//    public void printStackTrace(){
//
//    }
}
