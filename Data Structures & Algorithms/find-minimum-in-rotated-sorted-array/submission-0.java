class Solution {
    // Solution 1 - find the pivot by comparing mid value with right and left.
    public int findMin(int[] nums) {
        var l = 0;
        var r = nums.length - 1;

        while (l < r) {
            var mid = (l + r) / 2;

            var midValue = nums[mid];

            if (nums[r] < midValue) {
                // pivot is on the right of mid
                l = mid + 1;
            } else {
                // pivot is on the left or we are at pivot
                r = mid;
            }
        }

        return nums[l];
    }
}
