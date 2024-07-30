package day_33_3107;

// https://leetcode.com/problems/maximum-odd-binary-number/description/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumOddBinaryNumber("0101"));
    }

    // 1 ms Beats 71.78%
    public String maximumOddBinaryNumber(String s) {
        var result = new char[s.length()];
        int start = 0;
        int end = result.length - 2;
        for (int i = 0; i < s.length(); i++) {
            if (result[result.length - 1] != '1' && s.charAt(i) == '1') {
                result[result.length - 1] = '1';
            } else if (s.charAt(i) == '1') {
                result[start] = '1';
                start++;
            } else {
                result[end] = '0';
                end--;
            }
        }
        return new String(result);
    }
}
