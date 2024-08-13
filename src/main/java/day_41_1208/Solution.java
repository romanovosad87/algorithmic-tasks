package day_41_1208;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(solution.replaceElements(arr)));
    }

    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            var temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }
}
