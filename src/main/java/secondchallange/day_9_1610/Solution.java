package secondchallange.day_9_1610;

// https://leetcode.com/problems/validate-stack-sequences/description/

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] pushed = new int[] {1, 2, 3, 4, 5};
        int[] popped = new int[] {4, 5, 3, 2, 1};
        System.out.println(validateStackSequences(pushed, popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            j = checkStack(popped, stack, j);
            stack.push(pushed[i]);

        }
        checkStack(popped, stack, j);
        return stack.isEmpty();
    }

    private static int checkStack(int[] popped, Stack<Integer> stack, int j) {
        while (!stack.isEmpty() && stack.peek() == popped[j]) {
            stack.pop();
            j++;
        }
        return j;
    }
}
