class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // in the stack we store the entries that we haven't found the higher temperature for yet
        var stack = new Stack<Integer>();
        var result = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                var lastIndex = stack.pop();
                result[lastIndex] = i - lastIndex;
            }
            stack.push(i);  
        }

        return result;
    }
}
