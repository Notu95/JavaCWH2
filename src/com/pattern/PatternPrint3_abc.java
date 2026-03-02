package com.pattern;

public class PatternPrint3_abc {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            int counter = 0;
            char k='a';
            for (int j = i; j > 0; j--) {
                System.out.print(k);
                counter++;
                k++;
//                if (counter == i) {
//                    break;
//                }


            }
            System.out.println("");
        }
    }
}
