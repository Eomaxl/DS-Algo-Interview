package org.example.interview150.day1;

public class RemoveDuplicatedSortedArray {
    public static void main(String[] args){
        int[] nums = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Result :"+removeDuplicate(nums));
        System.out.println("Result :"+removeDuplicate(nums2));
    }
    public static int removeDuplicate(int[] nums) {
        int i = 1;
        for(int j = 0; j<nums.length-1; j++){
            if(nums[j] != nums[j+1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
