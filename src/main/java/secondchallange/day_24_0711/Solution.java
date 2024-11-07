package secondchallange.day_24_0711;

// https://leetcode.com/problems/arranging-coins/description/

public class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int rows = 0;
        while (n - i >= 0) {
            n -= i;
            i++;
            rows++;
        }
        return rows;
    }
}
