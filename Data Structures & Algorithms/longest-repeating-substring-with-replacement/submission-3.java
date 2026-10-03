class Solution {
    public int characterReplacement(String s, int k) {
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < s.length(); j++) {

                freq[s.charAt(j) - 'A']++;

                maxFreq = Math.max(
                    maxFreq,
                    freq[s.charAt(j) - 'A']
                );

                int windowSize = j - i + 1;

                if (windowSize - maxFreq <= k) {
                    longest = Math.max(longest, windowSize);
                }
            }
        }

        return longest;
    }
}
// [?, ?, ?, ?] k=1 -> 0
// longestSubString = Math.max(longestSubString, 3)
// 1 <= s.length <= 1000
// 0 <= k <= s.length