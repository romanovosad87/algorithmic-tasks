package day_55_3008;

// https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java

public class Solution {
    public static String[] capitalize(String s){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb1.append((char)(s.charAt(i) - 32));
                sb2.append(s.charAt(i));
            } else {
                sb1.append(s.charAt(i));
                sb2.append((char) (s.charAt(i) - 32));
            }
        }
        return new String[]{sb1.toString(), sb2.toString()};
    }
}
