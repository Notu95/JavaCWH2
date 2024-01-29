package com.collectionsframeworks_1;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayDeque_1 {
    public static void main(String[] args) {
        ArrayDeque<String> ad1=new ArrayDeque<>();
        ArrayDeque<Integer> ad2=new ArrayDeque<>();

        ad1.add("A");
        ad1.addLast("B");
        ad1.offerLast("C");

        System.out.println(ad1);
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekFirst());// doesnot throws exception, but getFirst throws exception
        System.out.println(ad1.peek());

        { ArrayList<Integer> al1= new ArrayList<>();
        al1.add(5);al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(2);al1.add(5);al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(2);al1.add(5);al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(2);al1.add(5);al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(2);
        al1.add(5);al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(2);al1.add(5);al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(2);
        ad2.addAll(al1);}

        System.out.println(ad2);

    }
}
