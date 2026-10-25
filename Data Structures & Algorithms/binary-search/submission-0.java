class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int i = (l + r) / 2;

        while (nums[i] != target && l != r) {
            if (nums[i] < target) {
                l = i + 1;
            } else {
                r = i;
            }
            i = (l + r) / 2;
        }

        return nums[i] == target ? i : -1;
    }
}
