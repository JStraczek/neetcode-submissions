class Solution {
    private record Pair(int index, int value) {
    }


    public int[] dailyTemperatures(int[] temperatures) {
        // in the stack we store the entries that we haven't found the higher temperature for yet
        var stack = new Stack<Pair>();
        var result = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek().value() < temperatures[i]) {
                var pair = stack.pop();
                result[pair.index()] = i - pair.index();
            }
            stack.push(new Pair(i, temperatures[i]));  
        }

        return result;
    }
}
