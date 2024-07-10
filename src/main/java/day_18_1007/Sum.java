package day_18_1007;

// https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java

public class Sum {
    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
