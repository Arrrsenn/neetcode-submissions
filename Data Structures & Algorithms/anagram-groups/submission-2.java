class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> mapList = new HashMap<>();

        for (String s : strs) {
            char[] strChar = s.toCharArray();
            Arrays.sort(strChar);
            String sortKey = new String(strChar);
            if (!mapList.containsKey(sortKey)) {
                mapList.put(sortKey, new ArrayList<>());
            }
            mapList.get(sortKey).add(s);
        }

        return new ArrayList<>(mapList.values());
    }
}
