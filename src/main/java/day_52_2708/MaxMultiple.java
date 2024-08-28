package day_52_2708;

// https://www.codewars.com/kata/5aba780a6a176b029800041c/train/java

public class MaxMultiple {
    public static int maxMultiple(int divisor, int bound) {
        for (int i = bound; i > 0; i--) {
            if (i % divisor == 0) {
                return i;
            }
        }
        return -1;
    }
}
