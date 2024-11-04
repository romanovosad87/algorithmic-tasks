package secondchallange.day_21_0411;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 2, 4, 6, 8};
        int target = 4;
        System.out.println(search(nums, target));
    }


    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = (high + low)/2;
            if (target > nums[middle]) {
                low = middle + 1;
            } else if (target < nums[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
