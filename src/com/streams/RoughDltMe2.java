package com.streams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RoughDltMe2 {


    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();
        LinkedList<Integer> l3=new LinkedList<Integer>();
        LinkedList<Integer> l4=new LinkedList<Integer>();
        l1.add(5);
        l1.add(6);
        l2.add(7);
        l2.add(8);

        l3.add(5);
        l3.add(6);
        l4.add(7);
        l4.add(8);

        //l1.addAll(l2);
        l1.addAll(1,l2);

        l3.addFirst(1);
        l3.addLast(2);
        l3.addAll(l4);
        l3.set(5,10);

        System.out.println(l1);
        System.out.println(l3);

    }

}
