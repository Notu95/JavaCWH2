package com.leetCode;

import java.util.HashMap;

/*
Best way:
public static boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) return false;

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

    for (int c : count) {
        if (c != 0) return false;
    }

    return true;
}
 */

public class LeetCode4_Anagram {
   public static void main(String[] args) {
         String str1 ="anagram";
         String str2 ="nagaram";
       System.out.println(isAnagram(str1,str2));


    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }

        System.out.println(map1);
        System.out.println(map2);
    return map1.equals(map2);
    }
}
