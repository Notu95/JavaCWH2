package com.pattern;

import java.util.logging.*;

import java.util.logging.Logger;
import java.util.logging.Level;

public class DynamicCapcha {
    private static final Logger logger = Logger.getLogger(DynamicCapcha.class.getName());
    public static void main(String[] args) {

        String str= "Capcha 9 / 3 = ?";

        char firstDigit;
        char lastDigit;
        char operator;

        firstDigit= str.charAt(7);
        lastDigit=str.charAt(11);
        operator=str.charAt(9);

        logger.info("firstDigit,lastDigit,operator");
        System.out.println(Character.toString(firstDigit));
        System.out.println(Character.toString(lastDigit));
        System.out.println(Character.toString(operator));

        int intfirstDigit=Character.getNumericValue(firstDigit);
        int intlastDigit=Character.getNumericValue(lastDigit);
        Integer.getInteger(String.valueOf(lastDigit));///imp

        int capchaValue=0;

        switch (operator){
            case '*':
                capchaValue=intfirstDigit * intlastDigit;
                break;
            case '+':
                capchaValue=intfirstDigit + intlastDigit;
                break;
            case '-':
                capchaValue=intfirstDigit - intlastDigit;
                break;
            case '/':
                capchaValue=intfirstDigit / intlastDigit;
                break;
        }

        System.out.println("Capcha Valu is :"+  capchaValue);



    }
}
