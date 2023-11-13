package org.example.interview150.day1;
/**
 * Given an integer array nums, rotate the array to the right by k steps,
 * where k is non-negative.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 *
 *  Example 2:
 *  Input: nums = [-1,-100,3,99], k = 2
 *  Output: [3,99,-1,-100]
 * */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int a = nums.length - k;

        rotateArr(nums, 0, a -1);
        rotateArr(nums,a, nums.length-1);
        rotateArr(nums,0, nums.length -1);
    }

    public void rotateArr(int[] nums,int a, int b){
        if(nums == null || nums.length == 1)
            return;
        while(a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}
