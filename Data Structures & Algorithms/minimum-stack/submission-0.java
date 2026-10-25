class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    // 1. initialize empty Stack
    // 2. initialize data structure for tracking minimum element
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    // 1. add the val to top of stack
    // 2. if it is lower than minimum update the minimum
    public void push(int val) {
        this.stack.push(val);
        if (this.minStack.isEmpty()) {
            this.minStack.push(val);
        } else {
            this.minStack.push(Math.min(val, this.minStack.peek()));
        }
    }

    // 1. pop the val from top of stack
    // 2. update the minimum if it was a minimum
    public void pop() {
        this.stack.pop();
        this.minStack.pop();
    }

    // 1. return val from top of stack
    public int top() {
        return this.stack.peek();
    }

    // 1. return minimum element
    public int getMin() {
        return this.minStack.peek();
    }

    // How to track the minimum element?
    // We need to keep the sorted collection somewhere so that we keep track of minimum, and
    // in case we remove it, we know the next minimum
}
