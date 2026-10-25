class Solution {
    // My solution - filtered string, two pointers
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // O(N)
        int left = 0;
        int right = cleanString.length() - 1;

        while (left <= right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
