class MinStack {
    Stack<Integer> min;
    Stack<Integer> holder;
    public MinStack() {
        min = new Stack<>();
        holder = new Stack<>();       
    }
    
    public void push(int val) {
        if(min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        holder.push(val);
    }
    
    public void pop() {
        if(holder.isEmpty()) return;
        int top = holder.pop();
        if(top == min.peek()) {
            min.pop();
        }

    }
    
    public int top() {
        return holder.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
