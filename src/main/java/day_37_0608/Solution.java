package day_37_0608;

// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

public class Solution {

    public int countOdds(int low, int high) {
        int oddsCount = 0;

        if (low % 2 != 0 || high % 2 != 0) {
            oddsCount = (high - low) /2 + 1;
        } else {
            oddsCount = (high - low) /2;
        }
        return oddsCount;
    }
}
