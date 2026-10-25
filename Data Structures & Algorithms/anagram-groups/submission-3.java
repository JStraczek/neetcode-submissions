class Solution {
    // Solution 2 - character frequency array, conversion of chars to 
    public List<List<String>> groupAnagrams(String[] strs) {
        var res = new HashMap<String, List<String>>();

        for (String s : strs) {
            int[] count = new int[26];
            
            for (char c : s.toCharArray()) {
                // c - 'a' is a conversion to zero-indexed lowercase ASCII value, regular numeric value of 'a' would be 97 so we are subtracting it
                // that way the numbers all fit in our count array: range 0 to 25
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
