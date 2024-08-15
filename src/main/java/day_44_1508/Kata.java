package day_44_1508;

// https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java

import java.util.stream.IntStream;

public class Kata {
    public static int sequenceSum(int start, int end, int step) {
        return IntStream.iterate(start, i -> i <= end, i -> i + step)
                .sum();
    }
}
