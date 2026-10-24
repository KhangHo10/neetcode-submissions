class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {

            int odd = search(s, i, i);
            int even = search(s, i, i+1);

            int overall = Math.max(odd, even);

            int start = i - (overall - 1) / 2;

            if (result.length() < overall) {
                result = s.substring(start, start+overall);
            }

        }

        return result;
    }

    public int search(String s, int i, int j) {
        if (i < 0 || j >= s.length()) return j - i - 1;
        if (!s.substring(i, i+1).equals(s.substring(j, j+1))) return j - i - 1;

        return search(s, i-1, j+1);
    }
}
