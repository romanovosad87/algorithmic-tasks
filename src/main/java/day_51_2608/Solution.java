package day_51_2608;

// https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("CODe"));
    }
    public static String solve(final String str) {
        var originalSum = str.chars().sum();
        var lowerSum = str.toLowerCase().chars().sum();
        var upperSum = str.toUpperCase().chars().sum();
        return Math.abs(originalSum - lowerSum) <= Math.abs(originalSum - upperSum)
                ? str.toLowerCase()
                : str.toUpperCase();
    }
}
