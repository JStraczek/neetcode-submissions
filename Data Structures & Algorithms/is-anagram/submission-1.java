class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var hashMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i ++) {
            if (hashMap.get(s.charAt(i)) != null) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            } 
            if (hashMap.get(t.charAt(i)) != null) {
                hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
            } else {
                hashMap.put(t.charAt(i), -1);
            }  
        }
        return hashMap.values().stream().allMatch(value -> 0 == value);
    }
}
