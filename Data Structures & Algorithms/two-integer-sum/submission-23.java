class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> holder = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (holder.containsKey(diff)) return new int[]{holder.get(diff), i};

            holder.put(nums[i], i);
        }

        return new int[2];
    }
}
