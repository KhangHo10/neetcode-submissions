class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(" ")) return 1;

        int left = 0;
        int right = 0;
        int count = 0;
        int curr = 0;
        HashSet<Character> holder = new HashSet<>();
        char[] c = s.toCharArray();

        while (right < s.length()) {
            if (!holder.contains(c[right])) {
                holder.add(c[right]);
                curr++;
                right++;
                count = Math.max(count, curr);
            }else {
                count = Math.max(count, curr);
                holder.remove(c[left]);
                curr--;
                left++;
            }
        }

        return count;
    }
}
