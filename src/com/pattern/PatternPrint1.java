package com.pattern;

import java.sql.SQLOutput;

public class PatternPrint1 {
    public static void main(String[] args) {

//1
        for(int x=0;x<6;x++){
            for(int y=x;y<6;y++){
                System.out.print(x);
            }
            System.out.println("");
        }
//2
        for(int x=5;x>=0;x--){
            for(int y=x;y>=0;y--){
                System.out.print(x);
            }
            System.out.println("");
        }
 //3
        for(int x=0;x<6;x++){
            for(int y=x;y>-1;y--){
                System.out.print(x);
            }
            System.out.println("");
        }
//4
        for(int x=5;x>=0;x--){
            for(int y=x;y>-1;y--){
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}
