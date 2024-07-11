package day_19_1107;

// https://www.codewars.com/kata/56d931ecc443d475d5000003/java

import java.util.concurrent.ThreadLocalRandom;

public class ThinkingAndTesting {

    public static int testTrueFalse(int n) {
        if (n <= 1) {
            return n;
        } else if (n <= 3) {
            return n - 1;
        } else if (n <= 6) {
            return Math.round(n / 3f);
        } else {
            // todo: complete last test case
            return ThreadLocalRandom.current().nextInt(20);
        }
    }
}
