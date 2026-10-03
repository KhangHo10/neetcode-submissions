class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> holder = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            holder.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int curr = target - nums[j];

            if (holder.containsKey(curr) && (j != holder.get(curr))) return new int[]{j, holder.get(curr)};
        }

        return new int[2];
    }
}
