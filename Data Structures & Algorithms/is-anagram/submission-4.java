class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] compare = new int[26];

        for(int i = 0; i < s.length(); i++) {
            compare[s.charAt(i) - 'a']++;
            compare[t.charAt(i) - 'a']--;
        }

        for(int j : compare) {
            if(j != 0) {
                return false;
            }
        }
        return true;
    }
}
