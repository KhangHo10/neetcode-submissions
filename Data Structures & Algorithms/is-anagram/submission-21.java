class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> holderOne = new HashMap<>();
        HashMap<Character, Integer> holderTwo = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            holderOne.put(s.charAt(i), holderOne.getOrDefault(s.charAt(i), 0)+1);
            holderTwo.put(t.charAt(i), holderTwo.getOrDefault(t.charAt(i), 0)+1);
        }
        
        return holderOne.equals(holderTwo);
    }
}
