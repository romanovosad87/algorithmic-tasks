package day_50_2308;

// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java

public class Kata {
    public static String reverseLetter(final String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(str.charAt(i))) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
