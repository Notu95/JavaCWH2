package com.leetCode;
/*
Question:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode3_DuplicateCheck {
    public static void main(String[] args) {
        int[] nums=input();    //{1,2,3,56,0};
        System.out.println(checkDuplicate(nums));
    }

    private static boolean checkDuplicate(int[] nums) {
        List<Integer> numsList= (List) Arrays.stream(nums).boxed().collect(Collectors.toList());
        boolean isDuplicate=false;
        for(int i=0;i< numsList.size();i++){
            for(int j=0;j< numsList.size();j++) {
                if (numsList.get(i).equals(numsList.get(j))  && i != j) isDuplicate = true;
            }
        }

        return isDuplicate;
    }
    static int[] input() {
        int[] input = {

                94886,94886,28821,20675,98974,22621,91823,44730,6160,99710,46764,46571,55716,11540,28266,73209,13807,8993,18841,89902,59175,90398,77670,64665,40145,45521,57445,49570,11896,18068,67432,83592,26821,58985,26944,84818,54572,20638,14656,206,70860,93071,44055,96137,3536,72607,78294,97322,77146,57043,54165,90341,61515,8318,1711,80599,37455,83277,24794,77134,25009,148,21904,71534,95227,96105,27114,83113,5950,11348,15844,75966,47447,27051,8887,35354,40231,70795,11906,33565,86815,71649,35906,75200,70001,97367,42827,83577,16687,27315,16493,93667,91973,48885,15583,17731,54936,74874,82474,1399,73080,13759,25206,81472,58730,5147,74013,21594,53260,33459,91020,52332,45901,84370,44027,41557,4514,87642,55924,75849,89189,26048,20291,90824,92839,97513,16950,43040,26594,20167,23935,14649,8783,58112,80561,40255,78519,92347,63255,75073,65568,16186,61602,19834,80650,9385,78664,32019,60731,13899,20208,70056,83777,96104,63008,28428,71002,90604,5387,79698,72818,31054,82023,44135,71636,57306,61287,80836,78352,26708,9200
       //23,0,8
        };
        return input;
    }

}
