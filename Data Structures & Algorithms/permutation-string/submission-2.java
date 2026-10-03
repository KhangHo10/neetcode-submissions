class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] holder = new int[26];

        for (char c : s1.toCharArray()) {
            holder[c - 97]++;
        }

        int[] temp = new int[26];

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            if (i == 0) {
                for (int j = 0; j < s1.length(); j++) {
                    temp[s2.charAt(i + j) - 97]++;
                }
            }else {
                temp[s2.charAt(i - 1) - 97]--;
                temp[s2.charAt(i + s1.length() - 1) - 97]++;
            }

            if (Arrays.equals(holder, temp)) return true;
        }

        return false;
    }
}
