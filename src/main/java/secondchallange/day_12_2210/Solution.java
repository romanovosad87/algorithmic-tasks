package secondchallange.day_12_2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int[] temp = new int[] {30, 38, 30, 36, 35, 40, 28};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        List<Integer> stack = new ArrayList<>();
        for (int i = temperatures.length - 1; i >= 0 ; i--) {
            int j = 0;
            var current = temperatures[i];
            for (var temp : stack) {
                if (temp > current) {
                    break;
                }
                j++;
            }
            res[i] = j == stack.size() ? 0 : j + 1;
            stack.add(0, current);
        }
        return res;
    }
}
