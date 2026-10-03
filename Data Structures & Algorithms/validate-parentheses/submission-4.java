class Solution {
    public boolean isValid(String s) {
        Stack<Character> holder = new Stack<>();

        for(char a : s.toCharArray()){
            
            if(a == ')' && !holder.empty()) {
                if(holder.peek() == '(') {
                    holder.pop();
                }else {
                    holder.push(a);
                }
            }else if(a == '}' && !holder.empty()) {
                if(holder.peek() == '{') {
                    holder.pop();
                }else {
                    holder.push(a);
                }    
            }else if(a == ']' && !holder.empty()){
                if(holder.peek() == '[') {
                    holder.pop();
                }else {
                    holder.push(a);
                }         
            }else {
                holder.push(a);
            }
        }

        return holder.empty();
    }
}
