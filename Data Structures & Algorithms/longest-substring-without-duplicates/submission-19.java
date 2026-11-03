class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> holder = new HashSet<>();
        int left = 0;
        int right = 0;

        int max = 0;

        while (right < s.length()) {

            if (!holder.contains(s.charAt(right))) {
                holder.add(s.charAt(right));
                right++;
            }else {
                holder.remove(s.charAt(left));
                left++;
            }
            max = Math.max(max, right-left);
        }

        return max;
    }
}
