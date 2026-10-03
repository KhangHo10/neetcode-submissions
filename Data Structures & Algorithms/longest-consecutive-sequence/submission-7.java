class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();
        int longest = 0;

        for (int n : nums) holder.add(n);

        for (int n : nums) {
            int curr = 1;

            if (!holder.contains(n-1)) {
                while (holder.contains(n+1)) {
                    curr++;
                    n++;
                }
            }

            longest = Math.max(curr, longest);
        }

        return longest;
    }
}
