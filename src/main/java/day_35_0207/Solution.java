package day_35_0207;

// https://leetcode.com/problems/excel-sheet-column-title/description/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(26));
    }
    public String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            builder.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return builder.reverse().toString();
    }
}
