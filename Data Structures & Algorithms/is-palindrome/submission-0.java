class Solution {
    public boolean isPalindrome(String s) {
        String modifyString = "";

        for(char holder : s.toCharArray()) {
            if(Character.isLetter(holder) || Character.isDigit(holder)) {
                modifyString += holder;
            }
        }

        modifyString = modifyString.toLowerCase();

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
