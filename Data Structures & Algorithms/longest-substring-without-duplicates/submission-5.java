class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> holder = new HashSet<>();
        int l = 0;
        int max = 0;

        for(int r = 0; r < s.length(); r++) {
            while(holder.contains(s.charAt(r))) {
                holder.remove(s.charAt(l));
                l++;
            }
            holder.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
