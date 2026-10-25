class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numberMap.get(nums[i]) != null) {
                return new int[]{numberMap.get(nums[i]), i};
            }

            numberMap.put(target - nums[i], i);
        }

        return new int[]{};
    }
}