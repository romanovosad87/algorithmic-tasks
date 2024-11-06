package secondchallange.day_19_3109;

// https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class Solution extends GuessGame {
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
}
