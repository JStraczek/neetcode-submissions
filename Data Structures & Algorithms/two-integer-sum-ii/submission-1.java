class Solution {
    // [1,1,2,3,4,7] target = 6
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        // while leftVal + rightVal > target -> right --
        //while leftVal + rightVal < target -> left ++

        while (numbers[left] + numbers[right] != target) {
            while (numbers[left] + numbers[right] > target) {
            right --;
            }

            while(numbers[left] + numbers[right] < target) {
                left ++;
            }
        }

        return new int[]{left + 1, right + 1};
    }
}
