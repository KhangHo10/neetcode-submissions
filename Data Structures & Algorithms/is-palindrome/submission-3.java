class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        s.toLowerCase();

        while (left < right) {
            char a = Character.toLowerCase(s.charAt(left));
            char b = Character.toLowerCase(s.charAt(right));

            if (!Character.isDigit(a) && !Character.isLetter(a)) {
                left++;
            }else if (!Character.isDigit(b) && !Character.isLetter(b)) {
                right--;
            }else {
                if (a != b) return false;
                left++;
                right--;
            }
        }

        return true;
    }
}
