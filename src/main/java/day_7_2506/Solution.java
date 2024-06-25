package day_7_2506;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Solution {

        public int maxProfit(int[] prices) {
            int left = 0;
            int max = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[left] < prices[i]) {
                    max = Math.max(max, prices[i] - prices[left]);
                } else {
                    left = i;
                }
            }
            return max;
        }
}
