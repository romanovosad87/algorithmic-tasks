package day_10_2806;

// https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java

public class Square {

    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
