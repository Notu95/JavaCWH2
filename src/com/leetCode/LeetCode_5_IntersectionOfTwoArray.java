package com.leetCode;
//See the question here
/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

 Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */
// Another short cut: using short
/*
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            res[k] = result.get(k);
        }

        return res;
    }
}
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_5_IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 ={1,2,4,6,7,7,9};
        int[] nums2 ={1,4,7,3,9,8,9,7};
        int[] resultArray=intersect(nums1,nums2);
        for(int res: resultArray){
            System.out.println(res);
        }

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            Integer integer1=nums1[i];
            if(map1.containsKey(integer1)){
                map1.put(integer1,map1.get(integer1)+1);
            }else{
                map1.put(integer1,1);
            }
        }

        List<Integer> result= new ArrayList<>();
        for(int num : nums2){
            if(map1.containsKey(num) && map1.getOrDefault(num,0)>0){
                result.add(num);
                map1.put(num,map1.get(num)-1);
            }
        }

        int[] resultArray=new int[result.size()];
        int i=0;
        for(int res:result){
            resultArray[i] =res;
            i++;
        }
        return resultArray;
    }
}
