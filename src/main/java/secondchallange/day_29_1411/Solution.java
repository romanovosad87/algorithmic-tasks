package secondchallange.day_29_1411;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class Solution {

    public static void main(String[] args) {
        int[] weights = new int[] {3,2,2,4,1,4};
        int days = 3;
        Solution solution = new Solution();
        System.out.println(solution.shipWithinDays(weights, days));
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = findMax(weights);
        int right = sum(weights);
        int capacity = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int countedDays = countDays(weights, mid);
            if (countedDays <= days) {
                capacity = Math.min(capacity, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return capacity;
    }

    private int findMax(int[] weights) {
        int max = weights[0];
        for (int i = 1; i < weights.length; i++) {
            if (max < weights[i]) {
                max = weights[i];
            }
        }
        return max;
    }

    private int sum(int[] weights) {
        int sum = 0;
        for (var num : weights) {
            sum += num;
        }
        return sum;
    }

    private int countDays(int[] weights, int capacity) {
        int days = 0;
        int temp = capacity;
        for (var weight : weights) {
            if (temp - weight >= 0) {
                temp -= weight;
            } else {
                days++;
                temp = capacity - weight;
            }
        }
        days++;
        return days;
    }
}
