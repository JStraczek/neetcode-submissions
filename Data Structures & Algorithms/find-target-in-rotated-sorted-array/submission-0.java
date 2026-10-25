class Solution {
    public int search(int[] nums, int target) {
        var l = 0;
        var r = nums.length - 1;
        

        // find the pivot
        while (l < r) {
            int mid = (l + r) / 2;

            if (nums[mid] > nums[r]) {
                // this means pivot is on the right of mid
                l = mid + 1;
            } else {
                // pivot on the left of mid or same
                r = mid;
            }
        }

        var pivot = l;
        var leftArrResult = binarySearch(nums,target,0,pivot - 1);
        return leftArrResult != -1 ? leftArrResult : binarySearch(nums, target, pivot, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
