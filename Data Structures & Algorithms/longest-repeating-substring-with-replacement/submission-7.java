class Solution {
    public int characterReplacement(String s, int k) {
        int[] holder = new int[26];
        int left = 0;
        int right = 0;

        int currMax = 0;
        int maxLen = 0;

        while (right < s.length()) {
            holder[s.charAt(right) - 'A']++;
            currMax = Math.max(currMax, holder[s.charAt(right) - 'A']);

            int window = right - left + 1 ;

            if (window - currMax > k) {
                holder[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }

        return maxLen;
    }
}

// X Y XXX Y C
