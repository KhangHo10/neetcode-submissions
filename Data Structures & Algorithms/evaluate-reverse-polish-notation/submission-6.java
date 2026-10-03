class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for(String s : tokens) {
            int a;
            int b;
            if(s.equals("+")) {
                nums.push(nums.pop() + nums.pop());
            }else if(s.equals("-")) {
                a = nums.pop();
                b = nums.pop();
                nums.push(b - a);
            }else if(s.equals("*")) {
                nums.push(nums.pop() * nums.pop());
            }else if(s.equals("/")) {
                a = nums.pop();
                b = nums.pop();
                nums.push(b / a);
            }else {
                nums.push(Integer.parseInt(s));
            }
        }

        return nums.pop();
    }
}
