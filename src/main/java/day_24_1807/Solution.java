package day_24_1807;

// https://leetcode.com/problems/k-closest-points-to-origin/description/

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public int[][] kClosest(int[][] points, int k) {
        Comparator<int[]> comparator = (arr1, arr2) -> {
            var dist1 = arr1[0] * arr1[0] + arr1[1] * arr1[1];
            var dist2 = arr2[0] * arr2[0] + arr2[1] * arr2[1];
            return dist2 - dist1;
        };

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(comparator);
        for (var point : points) {
            priorityQueue.add(point);
            if (priorityQueue.size() > k) {
                priorityQueue.remove();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.remove();
        }
        return result;
    }
}
