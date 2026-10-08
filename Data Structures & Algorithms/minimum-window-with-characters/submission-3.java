class Solution {
    public String minWindow(String s, String t) {


        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();
        
        for (char a : t.toCharArray()) s2.put(a, s2.getOrDefault(a, 0) + 1);

        int left = 0;
        int right = 0;
        int count = 0;

        int len = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            
            s1.put(c, s1.getOrDefault(c, 0) + 1);
            if (s2.containsKey(c) && s1.get(c) <= s2.get(c)) count++;

            while (count == t.length()) {

                if (right - left < len) {   
                    start = left;
                    len = right - left + 1;
                }

                char k = s.charAt(left);

                s1.put(k, s1.get(k) - 1);
                
                if (s2.containsKey(k) && s1.get(k) < s2.get(k)) {
                    count--;
                }

                left++;
            }
            right++;
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
