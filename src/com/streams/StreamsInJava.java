package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsInJava {

    public static void main(String[] args) {
        List<Integer> L1=Arrays.asList(7,2,9,5,8,5,21,12,11,13);

        //Stream<Integer> s1=L1.stream();
        L1.stream()
                .filter(n -> n%2==1) // filtering odd values only
                .sorted()
                .map(n ->n*2)
                .forEach((n -> System.out.println(n)));   // printing stream
        //System.out.println(s1.count()); //cant be used more than one time
        System.out.println("............devider..............");

        int Result = L1.stream()
                .reduce(0,(c,e)->c+e);
        System.out.println(Result);

        System.out.println("............devider..............");

        int result = L1.parallelStream() // creates multiple thread and faster operation
                .reduce(0,(c,e)->c+e);
        System.out.println(result);
    }
}
