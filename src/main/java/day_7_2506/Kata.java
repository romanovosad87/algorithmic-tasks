package day_7_2506;

import java.util.List;

// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream()
                .filter(obj -> obj.getClass().equals(Integer.class))
                .toList();
    }
}
