class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();

        for (int i : nums) {
            if (holder.contains(i)) {
                return true;
            }

            holder.add(i);
        }

        return false;
    }
}