class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        backtrack(output, "", 0, 0, n);
        return output;
    }

    public void backtrack(List<String> output, String parenthese, int open, int close, int max) {
        if (parenthese.length() == max*2) {
            output.add(parenthese);
            return;
        }

        if (open < max) backtrack(output, parenthese + "(", open + 1, close, max);
        if (close < open) backtrack(output, parenthese + ")", open, close + 1, max);
    }

}
