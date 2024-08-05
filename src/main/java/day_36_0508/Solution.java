package day_36_0508;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
public class Solution {

    // 3 ms Beats 14.81%
    public String gcdOfStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        var str = str1.length() == minLength ? str1 : str2;
        while (!str.isEmpty()) {
            if (str1.length() % str.length() == 0 && str2.length() % str.length() == 0) {
                var replaceStr1 = str1.replace(str, "");
                var replaceStr2 = str2.replace(str, "");
                if (replaceStr1.isEmpty() && replaceStr2.isEmpty()) {
                    return str;
                }
            }
            str = str.substring(0, str.length() - 1);
        }
        return "";
    }
}
