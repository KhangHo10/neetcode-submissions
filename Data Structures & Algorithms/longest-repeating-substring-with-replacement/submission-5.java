class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        int[] holder = new int[26];

        while (right < s.length()) {
            holder[s.charAt(right) - 65]++;
            maxFrequency = Math.max(maxFrequency, holder[s.charAt(right) - 65]);

            int currentWindow = right - left + 1;

            if (currentWindow - maxFrequency > k) {
                holder[s.charAt(left) - 65]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength; 
    }
}
