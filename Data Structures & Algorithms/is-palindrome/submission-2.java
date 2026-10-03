class Solution {
    public boolean isPalindrome(String s) {
        // 1 < s.length() < 1000

        int l = 0; 
        int r = s.length() - 1;

        while (l < r) {
            char a = Character.toLowerCase(s.charAt(l));
            char b = Character.toLowerCase(s.charAt(r));

            if (!Character.isLetter(a) && !Character.isDigit(a)) {
                l++;
            }else if (!Character.isLetter(b) && !Character.isDigit(b)) {
                r--;
            }else {
                if (a != b) return false;
                l++;
                r--;
            }
        }

        return true;
    }
}

// was saw => palindrome
