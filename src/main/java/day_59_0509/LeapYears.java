package day_59_0509;

// https://www.codewars.com/kata/526c7363236867513f0005ca/train/java

public class LeapYears {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2015));
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }
}

