package day_22_1607;

import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/description/

public class KthLargest {

    private int k;
    private PriorityQueue<Integer> priorityQueue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>();
        for (var num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        priorityQueue.add(val);
        if (priorityQueue.size() > k) {
            priorityQueue.remove();
        }
        return priorityQueue.peek();
    }
}
