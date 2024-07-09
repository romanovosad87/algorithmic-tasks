package day_17_0907;

// https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java

public class Maskify {
    public static String maskify(String str) {
        int size = str.length();
        if (size <= 4) {
            return str;
        }
        return "#".repeat(size - 4) + str.substring(size - 4);
    }
}
