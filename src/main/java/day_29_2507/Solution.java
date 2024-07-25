package day_29_2507;

// https://leetcode.com/problems/find-the-town-judge/description/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] trust = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        System.out.println(solution.findJudge(4, trust));
        System.out.println(solution.findJudgeChatGPT(4, trust));
        System.out.println(solution.findJudgeEfficient(4, trust));
    }

    // brute force 10 ms Beats 20.34%
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) {
            return 1;
        }


        Set<Integer> set = new HashSet<>();
        for (int[] ints : trust) {
            set.add(ints[0]);
        }

        Set<Integer> set1 = new HashSet<>();
        for (int[] ints : trust) {
            set1.add(ints[1]);
        }

        for (var num : set) {
            set1.remove(num);
        }

        if (set1.size() != 1) {
            return -1;
        }
        int possibleJudge = set1.iterator().next();

        int match = 0;
        for (int[] ints : trust) {
            if (ints[1] == possibleJudge) {
                match++;
            }
        }

        return match == set.size() ? possibleJudge : -1;
    }

    // 3 ms Beats 59.86%
    public int findJudgeChatGPT(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }

        int[] trustCounts = new int[n + 1];
        int[] trustedByCounts = new int[n + 1];

        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];
            trustCounts[a]++;
            trustedByCounts[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == 0 && trustedByCounts[i] == n - 1) {
                return i;
            }
        }

        return -1; // No judge found
    }

    // 2 ms Beats 97.11%
    public int findJudgeEfficient(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) {
            return 1;
        }

        int[] freq = new int[n + 1];
        for (int[] ints : trust) {
            freq[ints[1]]++;
            freq[ints[0]] = 0;
        }
        int judgeOcc = 0;
        int judge = -1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > judgeOcc) {
                judgeOcc = freq[i];
                judge = i;
            }

        }
        if (judgeOcc == n - 1) {
            return judge;
        }
        return -1;
    }

}
