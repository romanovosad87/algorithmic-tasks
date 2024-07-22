package day_26_2207;

// https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java

public class Arge {

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 = (int)Math.floor(p0 + p0 * percent /100 + aug);
            years++;
        }
        return years;
    }
}
