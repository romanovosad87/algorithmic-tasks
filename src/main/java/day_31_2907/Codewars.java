package day_31_2907;

// https://www.codewars.com/kata/5949481f86420f59480000e7/train/java

public class Codewars {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{0, 1,2, 3, 4}));
    }
    public static String oddOrEven (int[] array) {
        int result = 0;
        for (var num : array) {
            result += num;
        }
        return result % 2 == 0 ? "even" : "odd";
    }
}
