package day_9_2706;

// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

public class Accumul {

    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            builder.append(String.valueOf(c).toUpperCase());
            String repeat = String.valueOf(c).toLowerCase().repeat(i);
            builder.append(repeat);
            if (i != s.length() - 1) {
                builder.append("-");
            }
        }
        return builder.toString();
    }
}
