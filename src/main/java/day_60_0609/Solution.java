package day_60_0609;

// https://www.codewars.com/kata/5b39e3772ae7545f650000fc/train/java

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static String removeDuplicateWords(String s){
        StringBuilder builder = new StringBuilder();
        Set<String> strings = new HashSet<>();
        for (var word : s.split("\\s+")) {
            if (strings.add(word)) {
                builder.append(word).append(" ");
            }
        }
       return builder.toString().trim();
    }
}
