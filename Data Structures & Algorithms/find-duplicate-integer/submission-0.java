class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();

        for (int n : nums) {
            if (!holder.add(n)) return n;
        }


        return 1;
    }
}
