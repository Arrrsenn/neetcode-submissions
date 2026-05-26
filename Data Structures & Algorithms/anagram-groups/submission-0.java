class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapList = new HashMap<>();

        for (String s : strs) {
            char[] strChar = s.toCharArray();
            Arrays.sort(strChar);
            String sortKey = new String(strChar);
            if (mapList.containsKey(sortKey)) {
                mapList.get(sortKey).add(s);
            } else {
                mapList.put(sortKey, new ArrayList<>());
                mapList.get(sortKey).add(s);
            }
        }

        return new ArrayList<>(mapList.values());
    }
}
