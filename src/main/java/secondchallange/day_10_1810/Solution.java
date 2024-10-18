package secondchallange.day_10_1810;

import java.util.ArrayList;
import java.util.List;

// https://neetcode.io/problems/generate-parentheses

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    private void backtrack(List<String> list, String str, int open, int close, int n) {
        if (open == n && close == n) {
            list.add(str);
            return;
        }

        if (open < n) {
            backtrack(list, str + "(", open + 1, close, n);
        }

        if (close < open) {
            backtrack(list, str + ")", open, close + 1, n);
        }
    }
}
