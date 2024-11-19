package secondchallange.day_32_1911;

// https://neetcode.io/problems/search-2d-matrix

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = matrix[mid / columns][mid % columns];
            if (value == target) {
                return true;
            } else if (value > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
