package secondchallange.day_14_2410;

// https://neetcode.io/problems/car-fleet

import java.util.Comparator;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {

    // neetocode explanation
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < position.length; i++) {
            treeMap.put(position[i], speed[i]);
        }

        for (var entry : treeMap.entrySet()) {
            Integer pos = entry.getKey();
            Integer sp = entry.getValue();
            double pace = (double) (target - pos) / sp;
            if (stack.isEmpty()) {
                stack.push(pace);
            }

            if (!stack.isEmpty() && pace > stack.peek()) {
                stack.push(pace);
            }

        }
        return stack.size();
    }

    // optimized solution
    public int carFleet2(int target, int[] position, int[] speed) {
        int fleet = 0;
        int n = speed.length;
        double[] arrivalTime = new double[target];
        for (int i = 0; i < n; i++) {
            double time = ((double) (target - position[i]) / speed[i]);

            arrivalTime[position[i]] = time;
        }

        var prev = 0.0;

        for (int i = target - 1; i >= 0; i--) {

            var current = arrivalTime[i];

            if (current > prev) {
                prev = current;
                fleet++;
            }
        }
        return fleet;
    }
}
