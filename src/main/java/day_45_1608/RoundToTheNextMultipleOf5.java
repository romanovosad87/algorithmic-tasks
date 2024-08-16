package day_45_1608;

// https://www.codewars.com/kata/55d1d6d5955ec6365400006d/train/java

import java.util.stream.IntStream;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        return IntStream.iterate(number, i -> i + 1)
                .filter(i -> i % 5 == 0)
                .limit(1)
                .findFirst()
                .orElseThrow();
    }
}
