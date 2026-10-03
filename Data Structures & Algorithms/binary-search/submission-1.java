class Solution {
    public int search(int[] nums, int target) {
        // 1 <= nums.length <= 10000
        // unique elements

        if (nums.length == 1 && nums[0] == target) return 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (right - left) / 2 + left;

            if (nums[middle] == target) {
                return middle;
            }else if (nums[middle] <= target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
