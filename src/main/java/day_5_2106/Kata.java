package day_5_2106;

// https://www.codewars.com/kata/554b4ac871d6813a03000035/solutions/java

public class Kata {
    public static void main(String[] args) {
        var str = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow(str));
    }

    public static String highAndLow(String numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(var num : numbers.split("\\s")) {
            int number = Integer.parseInt(num);
            if (min > number) {
                min = number;
            }

            if (max < number) {
                max = number;
            }
        }

        // Code here or
        return max + " " + min;
    }
}
