class Solution {
    // s = "([{}])"
    // 1. Define opening and closing brackets
    // 2. Iterate over the charArray
    // 3. For every char check what type of bracket it is
    // 4. Opening brackets are added to the stack
    // 5. Encountering closing brackets we pop the last element of the stack - 
    // - if it is a matching opening bracket, we can proceed, if it is not we return false as it is not a valid string
    // 6. After the loop the stack should be empty;
    private List<Character> OPENING_CHARS = List.of('(', '{', '[');
    private List<Character> CLOSING_CHARS = List.of(')', '}', ']');
    private Map<Character, Character> PARENTHESES_PAIRS = Map.of('(', ')', '{', '}', '[', ']');
    public boolean isValid(String s) {
        var characters = s.toCharArray();
        var stack = new Stack<Character>();
        for (char c : characters) {
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                var lastParentheses = stack.pop();
                if (this.PARENTHESES_PAIRS.get(lastParentheses) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
