class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        HashSet<List<Integer>> holder = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                int curr = nums[i] + nums[left] + nums[right];

                if (curr == 0) {
                    holder.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                }else if (curr > 0) {
                    right--;
                }else {
                    left++;
                }
            }
        }

        return new ArrayList<>(holder);
    }
}
