package day_13_0307;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        return Arrays.stream(phrase.split("\\s"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
