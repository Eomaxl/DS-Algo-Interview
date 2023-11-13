package org.example.interview150.day1;
/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * */

import java.util.*;
public class MajorityElement {

    public int majorityElement(int[] arr) {
        Map<Integer,Integer> mapping = new HashMap<>();
        for(int num: arr){
            if(!mapping.containsKey(num)){
                mapping.put(num,1);
            } else {
                int val = mapping.get(num)+1;
                mapping.put(num,val);
            }
        }
        int size = arr.length / 2;
        int max = 0;
        int number = 0;
        for(Map.Entry<Integer,Integer> entry : mapping.entrySet()){
            if((entry.getValue() > size) && (entry.getValue() > max)){
                max = entry.getValue();
                number = entry.getKey();
            }
        }
        return number;
    }
}
