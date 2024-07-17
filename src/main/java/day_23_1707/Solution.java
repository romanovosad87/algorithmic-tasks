package day_23_1707;

// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class Solution {

    public static boolean validatePin(String pin) {

        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }

        for (var c : pin.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
