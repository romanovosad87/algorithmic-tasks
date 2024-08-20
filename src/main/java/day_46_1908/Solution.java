package day_46_1908;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/group-anagrams/description/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> str.chars().sorted()
                        .mapToObj(c -> (char)c).map(String::valueOf)
                        .collect(Collectors.joining("")), Collectors.toList()))
                .values()
                .stream()
                .toList();
    }
}
