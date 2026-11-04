class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] holderA = new int[26];

        for (char c : s1.toCharArray()) {
            holderA[c - 'a']++;
        }

        int[] holderB = new int[26];

        for (int i = 0; i < s2.length()-s1.length()+1; i++) {
            if (i == 0) {
                for (int j = 0; j < s1.length(); j++) holderB[s2.charAt(j) - 'a']++;
            }else {
                holderB[s2.charAt(i-1) - 'a']--;
                holderB[s2.charAt(i + s1.length() - 1) - 'a']++;
            }
            if (Arrays.equals(holderA, holderB)) return true;
        }

        return false;
    }
}
