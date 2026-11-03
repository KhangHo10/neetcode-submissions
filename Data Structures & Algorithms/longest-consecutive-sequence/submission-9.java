class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();

        for (int n : nums) holder.add(n);

        int max = 0;

        for (int n : nums) {
            int curr = 1;

            if (!holder.contains(n-1)) {
                while (holder.contains(n+1)) {
                    curr++;
                    n++;
                }
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}
