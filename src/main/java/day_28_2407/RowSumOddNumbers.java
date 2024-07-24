package day_28_2407;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java

public class RowSumOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(3));
        System.out.println(rowSumOddNumbersMath(3));
    }

    // brute force solution
    public static int rowSumOddNumbers(int n) {
        var prevOddNums = sumNums(n - 1);
        return IntStream.iterate(1, i -> i + 2)
                .skip(prevOddNums)
                .limit(n)
                .sum();

    }

    // at least practice recursion
    private static int sumNums(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumNums(n - 1);
    }

    // when you know math or is too attentive and exploitative
    public static int rowSumOddNumbersMath(int n) {
        return n * n * n;
    }
}
