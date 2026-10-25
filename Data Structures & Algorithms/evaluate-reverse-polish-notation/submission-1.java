class Solution {
    private final List<String> OPERATORS = List.of("+", "-", "*", "/");
    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();
        for (String token : tokens) {
            if (OPERATORS.contains(token)) {
                // remove operands from the stack and perform the operation
                var y = stack.pop();
                var x = stack.pop();
                var operation = this.getOperationForOperand(token);
                var newResult = operation.apply(x, y);
                // push the result of the operation to the stack
                stack.push(newResult);
            } else {
                // append operand to the stack
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    private java.util.function.BiFunction<Integer, Integer, Integer> getOperationForOperand(String token) {
        switch (token) {
            case "+":
                return (x,y) -> x + y;
            case "-":
                return (x,y) -> x - y;
            case "*":
                return (x, y) -> x*y;
            case "/":
                return (x, y) -> Integer.valueOf(x/y);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
