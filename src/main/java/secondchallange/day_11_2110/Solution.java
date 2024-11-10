package secondchallange.day_11_2110;

// https://leetcode.com/problems/asteroid-collision/description/

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] asteroids = new int[] {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length < 2) {
            return asteroids;
        }
        Stack<Integer> stack = new Stack<>();
        for (var asteroid : asteroids) {
            boolean isDestroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int topAsteroid = stack.peek();

                if (Math.abs(asteroid) > topAsteroid) {
                    stack.pop();
                } else if (topAsteroid == Math.abs(asteroid)) {
                    stack.pop();
                    isDestroyed = true;
                    break;
                } else {
                    isDestroyed = true;
                    break;
                }
            }

            if (!isDestroyed) {
                stack.push(asteroid);
            }
        }
        return stack.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

}
