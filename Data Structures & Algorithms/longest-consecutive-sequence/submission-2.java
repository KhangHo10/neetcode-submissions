class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();
        int highestValue = 0;

        for(int n : nums) {
            holder.add(n);
        }

        for(int num : nums) {
            int current = 1;
            if(!holder.contains(num-1)) {
                while(holder.contains(num+1)) {
                    current++;
                    num++;
                }
            }

            highestValue = Math.max(highestValue, current);
        }
        return highestValue;
    }
}
