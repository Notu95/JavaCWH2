package com.collectionsframeworks_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<Integer> al1= new LinkedList<>();
        LinkedList<Integer> al2= new LinkedList<>();
        LinkedList<Integer> al3= new LinkedList<>();

        {al1.add(5);al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(2);
        al2.add(15);al2.add(16);al2.add(17);al2.add(18);al2.add(19);al2.add(12);
        al3.add(25);al3.add(26);al3.add(27);}

        al1.add(2,7);//just add not replaced
        al2.add(2,17);
        PrintAll(al1,al2,al3);

        al1.addLast(566);///Extra in linked list
        al1.addFirst(569);
        print1(al1);

        al2.addAll(al3);//appending
        al1.addAll(1,al3);//appending in a particular index
        PrintAll(al1,al2,al3);

        System.out.println(al1.contains(29));//checking contains
        System.out.println(al1.containsAll(al3));//checking containsAll
        System.out.println(al1.indexOf(7));//index of an element--> always searches from left and
        // if it gets then stops . Does not go for next element
        System.out.println(al1.lastIndexOf(7));

        System.out.println(al1.remove(7));//Removes the element at the specified position in
        // this list. Shifts any subsequent elements to the left (subtracts one from their indices).
        print1(al1);
        System.out.println(al1.remove(Integer.valueOf(5)));//removing an object
        print1(al1);
        System.out.println(al1.removeAll(al3));
        print1(al1);

        al1.set(1,500);
        print1(al1);// replacing an element

        al1.clear();
        print1(al1);

    }







    private static void print1(LinkedList<Integer> al1) {
        //System.out.println("...................");
        System.out.println(al1);
    }
    private static void PrintAll(LinkedList<Integer> al1, LinkedList<Integer> al2, LinkedList<Integer> al3) {
        System.out.println(".......................");
        System.out.println(al1);

        for(int i=0;i<al1.size();i++ ){
            System.out.print(al1.get(i)+"  ");
        }
        System.out.println();
        for(int i=0;i<al2.size();i++ ){
            System.out.print(al2.get(i)+"  ");
        }
        System.out.println();
        for(int i=0;i<al3.size();i++ ){
            System.out.print(al3.get(i)+"  ");
        }
        System.out.println();

    }
}
