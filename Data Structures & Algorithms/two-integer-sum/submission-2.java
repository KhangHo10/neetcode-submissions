class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        int tomp = 1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = tomp; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    temp[0] = i;
                    temp[1] = j;
                }
            }
            tomp++;
        }
        return temp;
    }
}
