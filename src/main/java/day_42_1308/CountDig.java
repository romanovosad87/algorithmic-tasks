package day_42_1308;

// https://www.codewars.com/kata/566fc12495810954b1000030/train/java

import java.util.stream.IntStream;

public class CountDig {

    public static void main(String[] args) {
        System.out.println(nbDig(5750, 0));
    }

    public static int nbDig(int n, int d) {
        return IntStream.rangeClosed(0, n)
                .map(num -> num * num)
                .map(num -> String.valueOf(num).length() - String.valueOf(num).replace(String.valueOf(d), "").length())
                .sum();

    }
}
