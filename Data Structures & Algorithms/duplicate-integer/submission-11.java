class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();
        
        for(int n : nums) {
            if(holder.contains(n)) {
                return true;
            }
            holder.add(n);
        }
        return false;
    }
}
