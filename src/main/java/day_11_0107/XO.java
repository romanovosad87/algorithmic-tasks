package day_11_0107;

// https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

public class XO {
    public static boolean getXO (String str) {
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            var c = str.charAt(i);
            if (c == 'x' || c == 'X') {
                x++;
            }
            if (c == 'o' || c == 'O') {
                o++;
            }
        }
        return x == o;
    }
}
