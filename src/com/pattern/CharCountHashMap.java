package com.pattern;

import java.util.HashMap;
import java.util.Map;

public class CharCountHashMap {



    public static void main(String[] args) {
        String Name="Souradeep Musib";
        Map<Character,Integer> copyCount=new HashMap<Character,Integer>();

        int length= Name.length();
        for(int i=0;i<length;i++){
            if(copyCount.containsKey(Character.toUpperCase(Name.charAt(i)))){
                copyCount.put(Character.toUpperCase(Name.charAt(i)),(copyCount.get(Character.toUpperCase(Name.charAt(i)))+1));
            }else{
                copyCount.put(Character.toUpperCase(  Name.charAt(i) ) ,1);
            }
        }
        System.out.println(copyCount);


    }
}
