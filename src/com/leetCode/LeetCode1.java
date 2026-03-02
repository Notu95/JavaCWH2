package com.leetCode;

import java.util.*;

/* Problem:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class LeetCode1{
    public static void main(String[] args) {
        int[] nums = {6,3,0,2,4,1,5};
        int target=6;

//        List<int[]> list=Arrays.asList(twoSum(nums,target));
        int[] result=twoSum(nums,target);
        for (int r:result) {
            System.out.println(r);
        }

    }
    static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map1 =new HashMap<>();
        int index=0;
        for(int i:nums){
            if(!(map1.containsKey(nums[index]))) {
                map1.put(index, nums[index]);
            }
            index++;
        }
        Set<Integer> KeySet=map1.keySet();
        for(Integer key:KeySet){
            for(Integer key1:KeySet) {
                if (key !=key1 && map1.get(key1)==(target-map1.get(key))){
                    int[] result= {key, key1};
                    return result;
                }
            }
        }
      return null;
    }
}
