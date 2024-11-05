package secondchallange.day_22_0511;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1,3};
        int target = 2;
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
        return high + 1;
    }
}
