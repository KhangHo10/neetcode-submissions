class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0]; 
        int[] holderA = new int[nums.length];
        int[] holderB = new int[nums.length];

        return Math.max(dfs(nums, holderA, 0, true), Math.max(dfs(nums, holderB, 1, false), dfs(nums, holderB, 2, false)));
    }

    public int dfs(int[] nums, int[] holder, int i, boolean loop) {
        if (i >= nums.length) return 0;
        if (i == nums.length-1 && loop) return 0;

        if (holder[i] != 0) return holder[i];

        int maxA = dfs(nums, holder, i+2, loop);
        int maxB = dfs(nums, holder, i+3, loop);

        holder[i] = nums[i] + Math.max(maxA, maxB);

        return holder[i];
    } 
}
