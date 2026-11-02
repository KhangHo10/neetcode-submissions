class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] holder = new int[26];

        for (char c : s.toCharArray()) holder[c - 'a']++;
        for (char c : t.toCharArray()) holder[c - 'a']--;

        for (int n : holder) {
            if (n != 0) return false;
        }

        return true;
    }
}
