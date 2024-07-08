package day_16_0807;

// https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class Solution {

    private int num;

    public Solution(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution(6);
        System.out.println(solution.guessNumber(100));
    }

    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int result = guess(middle);
            switch (result) {
                case 0 -> {
                    return middle;
                }
                case 1 -> start = middle + 1;
                default -> end = middle - 1;
            }
        }
        return 0;
    }

    private int guess(int guessNumber) {
        return Integer.compare(num, guessNumber);
    }
}
