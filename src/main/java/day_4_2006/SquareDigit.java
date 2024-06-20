package day_4_2006;

// https://www.codewars.com/kata/546e2562b03326a88e000020/train/java

public class SquareDigit {
    public static void main(String[] args) {
        SquareDigit squareDigit = new SquareDigit();
        System.out.println(squareDigit.squareDigits(3212));

    }

    public int squareDigits(int n) {
        int result = 0;
        String stringValue = String.valueOf(n);
        for (int i = 0; i < stringValue.length(); i++) {
            var charAt = stringValue.charAt(i);
            int num = Character.getNumericValue(charAt);
            int square = num * num;
            if (square < 10) {
                result = result * 10 + square;
            } else {
                result = result * 100 + square;
            }
        }
        return result;
    }
}
