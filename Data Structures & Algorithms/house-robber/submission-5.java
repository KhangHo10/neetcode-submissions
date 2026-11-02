class Solution {
    public int rob(int[] nums) {
        int[] holder = new int[nums.length];

        for (int i = 0; i < holder.length; i++) holder[i] = -1;

        return Math.max(dfs(nums, holder, 0), dfs(nums, holder, 1));
    }

    public int dfs(int[] nums, int[] holder, int i) {
        if (i >= nums.length) return 0;

        if (holder[i] != -1) return holder[i];

        int valA = dfs(nums, holder, i+2);
        int valB = dfs(nums, holder, i+3);

        int maxVal = nums[i] + Math.max(valA, valB);

        holder[i] = maxVal;
        return maxVal;
    }
}
