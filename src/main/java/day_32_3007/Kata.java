package day_32_3007;

// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/solutions/java

public class Kata {
    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));

    }

    public static String reverseWords(final String original) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < original.length()) {
            if (original.charAt(i) != ' ') {
                int start = i;
                while (i < original.length() && original.charAt(i) != ' ') {
                    i++;
                }
                for (int j = i - 1; j >= start; j--) {
                    builder.append(original.charAt(j));
                }
            } else {
                builder.append(original.charAt(i));
                i++;
            }
        }
        return builder.toString();
    }
}
