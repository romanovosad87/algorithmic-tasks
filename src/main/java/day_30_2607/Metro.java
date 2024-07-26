package day_30_2607;

// https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(array -> array[0] - array[1])
                .sum();
    }
}
