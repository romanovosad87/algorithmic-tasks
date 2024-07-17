package day_23_1707;

// https://leetcode.com/problems/last-stone-weight/description/

import java.util.Comparator;
import java.util.PriorityQueue;

public class SolutionLeetcode {
    
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (var stone : stones) {
            queue.add(stone);
        }

        while (!queue.isEmpty()) {
            var prev = queue.poll();
            var beforePrev = queue.poll();
            if (beforePrev == null) {
                return prev;
            } else if (prev.compareTo(beforePrev) > 0) {
                var difference = prev - beforePrev;
                queue.add(difference);
            }
        }
        return 0;
    }
}
