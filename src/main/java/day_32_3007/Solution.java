package day_32_3007;

// https://leetcode.com/problems/buy-two-chocolates/

import java.util.Arrays;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int leftover = money - prices[0] - prices[1];
        return leftover >= 0 ? leftover : money;
    }
}
