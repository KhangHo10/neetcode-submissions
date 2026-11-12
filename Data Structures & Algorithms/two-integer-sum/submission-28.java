class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> holder = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (holder.containsKey(target - nums[i])) return new int[]{holder.get(target - nums[i]), i};

            holder.put(nums[i], i);
        }

        return new int[0];
    }
}
