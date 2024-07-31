package day_33_3107;

// https://www.codewars.com/kata/555eded1ad94b00403000071/train/java

public class NthSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
    public static String seriesSum(int n) {
        int denominator = 1;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) 1 / denominator;
            denominator += 3;
        }
        return String.format("%.2f", sum);
    }
}
