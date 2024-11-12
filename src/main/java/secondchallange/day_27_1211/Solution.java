package secondchallange.day_27_1211;

// https://leetcode.com/problems/sqrtx/description/

public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        while (left <= right) {
            int middle = (left + right) / 2;
            long squareMiddle = (long)middle * middle;
            if (squareMiddle > x) {
                right = middle - 1;
            } else if (squareMiddle < x) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right;
    }
}
