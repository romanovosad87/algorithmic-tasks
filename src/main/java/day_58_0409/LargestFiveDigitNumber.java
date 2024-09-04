package day_58_0409;

// https://www.codewars.com/kata/51675d17e0c1bed195000001/train/java

public class LargestFiveDigitNumber {
    public static void main(String[] args) {
        System.out.println(solve("1234567890"));
    }
    public static int solve(final String digits) {
        String max = "";
        for (int i = 0; i <= digits.length() - 5; i++) {
            String substring = digits.substring(i, i + 5);
            if (substring.compareTo(max) > 0) {
                max = substring;
            }
        }
        return Integer.parseInt(max);
    }
}
