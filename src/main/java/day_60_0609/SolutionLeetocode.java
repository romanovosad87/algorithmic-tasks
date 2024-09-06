package day_60_0609;

// https://leetcode.com/problems/longest-repeating-character-replacement/

public class SolutionLeetocode {
    public static void main(String[] args) {
        SolutionLeetocode solution = new SolutionLeetocode();
        System.out.println(solution.characterReplacement("ABBB", 2));
    }

    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxCount = 0;
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char charAt = s.charAt(right);
            freq[charAt - 'A']++;
            maxCount = Math.max(maxCount, freq[charAt - 'A']);


            if ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
