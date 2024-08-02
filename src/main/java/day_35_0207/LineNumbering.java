package day_35_0207;

// https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java

import java.util.List;
import java.util.stream.IntStream;

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(number(List.of("a", "b", "c")));
    }
    public static List<String> number(List<String> lines) {
        return IntStream.range(1, lines.size() + 1)
                .mapToObj(i -> i + ": " + lines.get(i -1))
                .toList();
    }
}
