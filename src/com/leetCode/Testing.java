package com.leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Testing{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        List<Integer> priceList = Arrays.stream(arr).boxed().collect(Collectors.toList()) ;
        System.out.println("Try programiz.pro " + priceList);
    }
}
