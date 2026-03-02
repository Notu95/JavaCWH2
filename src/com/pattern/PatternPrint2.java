package com.pattern;

public class PatternPrint2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            int counter = 0;
            for (int j = i; j > 0; j--) {
                System.out.print(counter);
                counter++;
                if (counter == i) {
                    break;
                }


            }
            System.out.println("");
        }
    }
}
