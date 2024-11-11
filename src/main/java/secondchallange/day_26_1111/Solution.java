package secondchallange.day_26_1111;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
    public static boolean isPerfectSquare(int num) {

        if (num < 1) {
            return false;
        }

        long left = 1;
        long right = num;

        while (left <= right) {
            var middle = (left + right) / 2;
            if (middle * middle > num) {
                right = middle - 1;
            } else if (middle * middle < num) {
                left = left + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
