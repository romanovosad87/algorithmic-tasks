package day_54_2908;

// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[] values) {

        return Integer.parseInt(Arrays.stream(values)
            .distinct()
            .sorted()
            .mapToObj(i -> "" + i)
            .collect(Collectors.joining("")));
    }
}
