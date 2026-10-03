class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 1;
        for(int i = 0; i<nums.length-1; i++) {
            for(int j = count; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
            count++;
        }
        return false;

    }
}
