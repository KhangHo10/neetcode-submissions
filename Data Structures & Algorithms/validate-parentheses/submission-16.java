class Solution {
    public boolean isValid(String s) {
        // 1 < s.length() < 1000
        if (s.length() == 1) return false;

        Stack<Character> paren = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                paren.push(c);
            }else {
                if (paren.isEmpty()) return false;

                if (c == ')') {
                    if (paren.peek() == '(') {
                        paren.pop();
                    }else {
                        return false;
                    }    
                }else if (c == ']') {
                    if (paren.peek() == '[') {
                        paren.pop();
                    }else {
                        return false;
                    }    
                }else if (c == '}') {
                    if (paren.peek() == '{') {
                        paren.pop();
                    }else {
                        return false;
                    }    
                }else {
                    return false;
                }
            }
        }

        return paren.isEmpty();
    }
}
