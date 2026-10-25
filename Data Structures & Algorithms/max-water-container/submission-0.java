class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currentArea = this.calculateArea(left, right, heights);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (heights[left] <= heights[right]) {
                left++;
            } else if (heights[right] < heights[left]) {
                right--;
            }
        }

        return maxArea;
    }

    private int calculateArea(int left, int right, int[] heights) {
        if (right < left || right == left) {
            throw new RuntimeException("Left must be less than right!");
        }
        return Math.min(heights[left], heights[right]) * (right - left);
    }
}
