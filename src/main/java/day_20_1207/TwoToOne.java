package day_20_1207;

// https://www.codewars.com/kata/5656b6906de340bd1b0000ac

import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        // your code
        return (s1 + s2).chars()
                .distinct()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
