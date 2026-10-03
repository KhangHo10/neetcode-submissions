class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder modifyString = new StringBuilder();

        for(char holder : s.toCharArray()) {
            if(Character.isLetter(holder) || Character.isDigit(holder)) {
                modifyString.append(Character.toLowerCase(holder));
            }
        }

        int a = 0;
        int b = modifyString.length()-1;

        while(a <= b) {
            if(modifyString.charAt(a) != modifyString.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
