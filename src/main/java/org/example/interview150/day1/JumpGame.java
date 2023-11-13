package org.example.interview150.day1;
/**
 * You are given an integer array nums.
 * You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise
 *
 * nums=[2,3,1,1,4]
 * Output: true
 *
 *
 * */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i>=0; i--) {
            if (i + nums[i] >= lastPos){
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
