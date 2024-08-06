package day_37_0608;

// https://www.codewars.com/kata/5813d19765d81c592200001a/train/java

import java.util.stream.IntStream;

public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        return (int)IntStream.rangeClosed(start, end)
                .filter(num -> !String.valueOf(num).contains("5"))
                .count();
    }
}
