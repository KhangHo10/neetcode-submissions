class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> holder = new HashSet<>();
        int left = 0;
        int right = 0; 

        int longest = 0;

        while (right < s.length()) {

            if (holder.contains(s.charAt(right))) {
                holder.remove(s.charAt(left));
                left++;
            }else {
                holder.add(s.charAt(right));
                right++;
            }
            longest = Math.max(longest, right-left);
        }

        return longest;
    }
}
