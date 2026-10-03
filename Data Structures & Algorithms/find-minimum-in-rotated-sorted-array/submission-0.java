class Solution {
    public int findMin(int[] nums) {
        int minVal;
        int left = 0;
        int right = nums.length - 1;

        if (nums[right] - nums[left] > 1) return nums[0];

        while (left < right) {
            int mid = left + (right - left)/2;

            if (nums[right] > nums[mid]) {
                right = mid;
            }else {
                left = mid;
            }    

            if (right - left == 1) {
                if (nums[right] > nums[left]) return nums[left];
                return nums[right];
            }     
        }        
        return nums[left];
    }
}

// if last - first > 1 -> no rotation or rotation to org position
// if last - first = 0 or 1 -> rotation
