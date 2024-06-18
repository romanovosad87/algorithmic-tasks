package day_2_1806;

// https://www.codewars.com/kata/54ff3102c1bad923760001f3

public class Vowels {
    public static int getCount(String str) {
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
           if (vowels.contains(String.valueOf(str.charAt(i)))){
               count++;
           }
        }
        return count;
    }
}
