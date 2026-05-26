class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> letterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (letterMap.containsKey(c)) {
                int newValue = letterMap.get(c) + 1;
                letterMap.put(c, newValue);
            } else {
                letterMap.put(c, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (letterMap.containsKey(c)) {
                int newValue = letterMap.get(c) - 1;
                if (newValue < 0) {
                    return false;
                } else if (newValue == 0) {
                    letterMap.remove(c);
                } else {
                    letterMap.put(c, newValue);
                }
            } else {
                return false;
            }
        }

        return letterMap.isEmpty();
    }
}
