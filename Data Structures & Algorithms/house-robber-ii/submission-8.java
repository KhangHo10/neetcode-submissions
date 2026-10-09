class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] holderA = new int[nums.length];
        int[] holderB = new int[nums.length];

        return Math.max(dfs(nums, holderA, 0, nums.length-2), dfs(nums, holderB, 1, nums.length-1));
    }

    public int dfs(int[] nums, int[] holder, int i, int end) {
        if (i > end) return 0;

        if (holder[i] != 0) return holder[i];

        int curr = nums[i] + dfs(nums, holder, i+2, end);
        int skip = dfs(nums, holder, i+1, end);

        holder[i] = Math.max(curr, skip);

        return holder[i];
    }
}
