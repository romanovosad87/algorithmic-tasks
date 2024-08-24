package day_48_2108;

// https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java

public class Kata {
    public static boolean smallEnough(int[] a, int limit) {
        for (var val : a) {
            if (val > limit) {
                return false;
            }
        }
        return true;
    }
}
