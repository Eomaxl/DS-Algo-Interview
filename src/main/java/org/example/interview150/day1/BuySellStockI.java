package org.example.interview150.day1;
/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 *
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * */
public class BuySellStockI {
    public int maxProfit(int[] prices){
        int maxProfit = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<prices.length; i++){
            if(prices[i] > max){
                max = prices[i];
            }
            if(prices[i] < min){
                min = prices[i];
                max = prices[i];
            }

            int currentSum = max - min;
            maxProfit = Math.max(maxProfit,currentSum);
        }
        System.out.println("max : "+max+" and min :"+min);
        return maxProfit;
    }
}
