class MinStack {
    Stack<Integer> holder;
    Stack<Integer> minStack;

    public MinStack() {
        holder = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        holder.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
        
    }
    
    public void pop() {
        if (holder.isEmpty()) return;

        if (minStack.peek().equals(holder.peek())) {
            minStack.pop();
        }
        holder.pop();
    }
    
    public int top() {
        return holder.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
