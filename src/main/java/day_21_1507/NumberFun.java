package day_21_1507;

// https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java

public class NumberFun {

    public static long findNextSquare(long sq) {
        if (!isPerfect(sq)) {
            return -1;
        }

        for (long i = sq + 1; i < Long.MAX_VALUE; i++) {
            if (isPerfect(i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isPerfect(long num) {
        return Math.sqrt(num) % 1 == 0;
    }
}
