class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> holder = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                List<Integer> temp = new ArrayList<>();

                if (nums[i] + nums[left] + nums[right] == 0) {
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);

                    left++;
                    right--;
                    holder.add(temp);
                }else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }

        return new ArrayList<>(holder);
    }
}
