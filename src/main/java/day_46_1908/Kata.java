package day_46_1908;

// https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

public class Kata {
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }
        return test.toLowerCase().chars().sorted().sum() == original.toLowerCase().chars().sorted().sum();
    }
}
