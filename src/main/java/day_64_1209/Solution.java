package day_64_1209;

// https://www.codewars.com/kata/580a4734d6df748060000045/train/java

import java.util.HashSet;

public class Solution {
    public static String isSortedAndHow(int[] array) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                set.add("yes, ascending");
            } else if (array[i] > array[i+1]) {
                set.add("yes, descending");
            }
        }
        return set.size() > 1 ? "no" : set.iterator().next();
    }
}
