package com.pattern;

public class PatternPrinting {

    /*  pattern

     *
     **
     ***
     ****
    */

public static void main(String[] args){
    for(int i=0;i<4;i++){
        for(int j=4-i-1;j<4;j++) {
            System.out.print("*");
        }
        System.out.println("");
        }
    }
}
