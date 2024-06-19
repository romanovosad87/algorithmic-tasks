package day_3_1906;

// https://www.codewars.com/kata/52fba66badcd10859f00097e

import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Troll {
    public static String disemvowel(String str) {
        IntPredicate notVowelPredicate = character ->
                character != 'A' && character != 'a'
                        && character != 'E' && character != 'e'
                        && character != 'I' && character != 'i'
                        && character != 'O' && character != 'o'
                        && character != 'U' && character != 'u';
        return str.chars()
                .filter(notVowelPredicate)
                .mapToObj(ch -> String.valueOf((char)ch))
                .collect(Collectors.joining());
    }
}
