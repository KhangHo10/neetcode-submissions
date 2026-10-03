class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);

        Stack<Integer> holder = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            int curr = 0;
            
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int b = holder.pop();
                int a = holder.pop();

                if (tokens[i].equals("+")) curr = a + b;
                if (tokens[i].equals("-")) curr = a - b;
                if (tokens[i].equals("*")) curr = a * b;
                if (tokens[i].equals("/")) curr = a / b;

                holder.push(curr);
            }else {
                holder.push(Integer.parseInt(tokens[i]));
            }
        }

        return holder.pop();
    }
}
