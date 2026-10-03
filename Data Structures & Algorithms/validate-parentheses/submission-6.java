class Solution {
    public boolean isValid(String s) {
        Stack<Character> holder = new Stack<>();

        for(Character a : s.toCharArray()) {
            if(a == '(') {
                holder.push(')');
            }else if(a == '[') {
                holder.push(']');
            }else if(a == '{') {
                holder.push('}');
            }else if(holder.empty() || holder.pop() != a) {
                return false;
            }
        }
        return holder.empty();
    }
}
