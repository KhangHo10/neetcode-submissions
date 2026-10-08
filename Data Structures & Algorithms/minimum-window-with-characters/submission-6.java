class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> sHolder = new HashMap<>();
        HashMap<Character, Integer> tHolder = new HashMap<>();

        int left = 0;
        int right = 0;
        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (char d : t.toCharArray()) tHolder.put(d, tHolder.getOrDefault(d, 0) + 1);

        while (right < s.length()) {
            char a = s.charAt(right);

            sHolder.put(a, sHolder.getOrDefault(a, 0) + 1);

            if (tHolder.containsKey(a) && sHolder.get(a) <= tHolder.get(a)) {
                count++;
            }

            while (count == t.length()) {
                char b = s.charAt(left);

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                if (tHolder.containsKey(b) && sHolder.get(b) <= tHolder.get(b)) {
                    count--;
                }

                left++;
                sHolder.put(b, sHolder.get(b) - 1);
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
    }
}
