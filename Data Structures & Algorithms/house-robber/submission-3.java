class Solution {
    public int rob(int[] nums) {
        int[] holder = new int[nums.length];
        
        return Math.max(dfs(nums, holder, 0), dfs(nums, holder, 1));
    }

    public int dfs(int[] nums, int[] holder, int i) {
        if (i >= nums.length) return 0;

        if (holder[i] != 0) return holder[i];

        int maxA = dfs(nums, holder, i + 2);
        int maxB = dfs(nums, holder, i + 3);

        holder[i] = nums[i] + Math.max(maxA, maxB);

        return holder[i];
    }
}
