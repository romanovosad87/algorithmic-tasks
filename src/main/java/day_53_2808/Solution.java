package day_53_2808;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m < 2) {
            if (nums1[0] != 0) {
                return;
            } else {
                nums1[0] = nums2[0];
                return;
            }
        }
        int i =  m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[i + j + 1] = nums2[j];
                j--;
            } else {
                nums1[i + j + 1] = nums1[i];
                i--;
            }
        }
    }
}
