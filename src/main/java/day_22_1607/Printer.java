package day_22_1607;

// https://www.codewars.com/kata/56541980fa08ab47a0000040/train/java

public class Printer {

    public static String printerError(String s) {
        // your code
        var length = s.length();
        int error = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) > 109) {
                error++;
            }
        }
        return error + "/" + length;
    }
}
