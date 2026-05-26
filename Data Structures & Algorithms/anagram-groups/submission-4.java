class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> mapList = new HashMap<>();
        for (String s : strs) {
            int[] keyArray = new int[26];
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                keyArray[s.charAt(i) - 'a']++;
            }
            String keyString = Arrays.toString(keyArray);

            mapList.putIfAbsent(keyString, new ArrayList<>());
            mapList.get(keyString).add(s);
        }

        return new ArrayList<>(mapList.values());
    }
}
