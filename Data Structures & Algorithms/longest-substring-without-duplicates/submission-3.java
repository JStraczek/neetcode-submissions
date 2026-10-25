class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        var hashSet = new HashSet<Character>();
        int left = 0;
        int maxLen = 1;
        hashSet.add(s.charAt(left));
        // "abcabcbb"
        for (int right = 1; right < s.length(); right ++) {
            while (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left));
                left++;
            }

            hashSet.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    private boolean hasNoRepeatingCharacters(String s) {
        Set<Character> charsSet = s.chars()
            .mapToObj(e->(char)e).collect(Collectors.toSet());
        return charsSet.size() == s.length();
    }
}
