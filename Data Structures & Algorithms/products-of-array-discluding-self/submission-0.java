class Solution {
    // Solution 1 - go left to right then right to left
    // Initialize result array with ones
    // L -> R: store currentProduct which tracks product of all the elements to the left of current element, multiply currentProduct by result[i] and then currentProduct *= nums[i]
    // R -> L: Second pass, currentProduct now tracks product of all the elements to the right of current element, multiply currentProduct by result[i] and then currentProduct *= nums[i]
    public int[] productExceptSelf(int[] nums) {
        // initialize result
        var result = new int[nums.length];
        Arrays.fill(result, 1);
        var currentProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= currentProduct;
            currentProduct *= nums[i];
        }


        currentProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= currentProduct;
            currentProduct *= nums[i];
        } 

        return result;
    }
}  
