package day_39_0808;

// https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java

import java.util.stream.IntStream;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(num -> n % num == 0)
                .count();
    }
}
