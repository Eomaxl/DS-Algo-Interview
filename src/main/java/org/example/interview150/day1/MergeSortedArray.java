package org.example.interview150.day1;
/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 *  Example 1:
 *
 *  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 *  Output: [1,2,2,3,5,6]
 *  Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 *  The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 *
 *  Example 2:
 *  Input: Input: nums1 = [1], m = 1, nums2 = [], n = 0
 *  Output: [1]
 *  Explanation: The arrays we are merging are [1] and [].
 *  The result of the merge is [1].
 * */
public class MergeSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int len1 = 3,len2 = 3;
        mergeSortedArray(arr1,arr2,len1, len2);
        for(int num: arr1){
            System.out.print(num+" | ");
        }
    }
//    public static int[] mergeSortedArray(int[] arr1, int m, int[] arr2, int n){
//        int[] result = new int[m+n];
//        if(m == 0){
//            return arr2;
//        } else if(n == 0){
//            return arr1;
//        }
//        int i =0, j = 0, idx= 0;
//        while(i<m && j<n){
//            if((arr1[i] <= arr2[j]) && (arr1[i] != 0 && arr2[i] != 0)){
//                result[idx] = arr1[i];
//                i++;
//            } else {
//                result[idx] = arr2[j];
//                j++;
//            }
//            idx++;
//        }
//        if(i<m && j==n ){
//            for(; i<m; i++){
//                result[idx] = arr1[i];
//                idx++;
//            }
//        } else if(j <n && i ==m){
//            for(;j<n; j++){
//                result[idx] = arr2[j];
//                idx++;
//            }
//        }
//
//        return result;
//    }

    public static void mergeSortedArray(int[] arr1, int[] arr2, int m, int n){
        int p1 = m -1 ;
        int p2 = n - 1;

        for(int p = m+n -1 ; p >=0; p--){
            if(p2< 0 ){
                break;
            }
            if(p1 >= 0 && arr1[p1] > arr2[p2]){
                arr1[p] = arr1[p1--];
            } else {
                arr1[p] = arr2[p2--];
            }
        }
    }
}
