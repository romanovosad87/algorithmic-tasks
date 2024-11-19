package secondchallange.day_31_1811;

// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] spells = new int[] {5, 1, 3};
        int[] potions = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(successfulPairs(spells, potions, 7)));
    }


    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            var left = 0;
            var right = potions.length;
            while (left < right) {
                var mid = left + (right - left) / 2;
                long mulitply = spells[i] * potions[mid];
                if (mulitply >= success) {
                    right = mid;
                } else  {
                    left = mid + 1;
                }
            }
            res[i] = potions.length - left;
        }
        return res;
    }
}
