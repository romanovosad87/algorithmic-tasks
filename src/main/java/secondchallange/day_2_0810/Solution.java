package secondchallange.day_2_0810;

// https://leetcode.com/problems/baseball-game/description/

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int calPoints(String[] operations) {

        Deque<Integer> arrayDeque = new ArrayDeque<>();

        for (var operation : operations) {
            switch (operation) {
                case "+" -> {
                    var last = arrayDeque.pollLast();
                    var sum = last + arrayDeque.peekLast();
                    arrayDeque.add(last);
                    arrayDeque.add(sum);
                }
                case "D" -> arrayDeque.add(arrayDeque.peekLast() * 2);
                case "C" -> arrayDeque.removeLast();
                default -> arrayDeque.add(Integer.parseInt(operation));
            }
        }
        int sum = 0;
        for (int num : arrayDeque) {
            sum += num;
        }
        return sum;
    }
}
