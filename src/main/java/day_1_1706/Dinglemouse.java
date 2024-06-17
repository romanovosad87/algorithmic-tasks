package day_1_1706;

// https://www.codewars.com/kata/5a6d3bd238f80014a2000187/train/java

public class Dinglemouse {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        // Your code here!
        return new int[]{getHumanYears(catYears, true), getHumanYears(dogYears, false)};
    }

    private static int getHumanYears(int petYears, boolean isCat) {
        if (petYears < 15) {
            return  0;
        } else if (petYears < 24) {
            return  1;
        } else if (isCat) {
            return petYears < 28 ? 2 : 2 + (petYears - 24) / 4;
        } else {
            return petYears < 29 ? 2 : 2 + (petYears - 24) / 5;
        }
    }
}
