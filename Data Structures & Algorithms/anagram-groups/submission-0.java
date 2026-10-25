class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrs = Arrays.stream(strs).map(str -> {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }).toArray(String[]::new);
        var anagramsMap = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            var bucket = anagramsMap.getOrDefault(sortedStrs[i], new ArrayList<>());
            bucket.add(strs[i]);
            anagramsMap.put(sortedStrs[i], bucket);
        }

        return new ArrayList(anagramsMap.values());
    }
}
