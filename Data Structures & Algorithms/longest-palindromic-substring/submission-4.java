class Solution {
    public String longestPalindrome(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int odd = palindrome(s, i, i);
            int even = palindrome(s, i, i+1);

            int length = Math.max(odd, even);
            int start = i - (length - 1) / 2;
            
            if (result.length() < length) result = s.substring(start, start+length);
        }

        return result;
    }

    public int palindrome(String s, int i, int j) {
        if (i < 0 || j >= s.length()) return j - i - 1;
        if (s.charAt(i) != s.charAt(j)) return j - i - 1;

        return palindrome(s, i-1, j+1);
    }
}
