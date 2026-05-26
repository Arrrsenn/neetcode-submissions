class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        String[] splitS = s.split("");
        Map<String, Integer> letterMap = new HashMap<>();
        for (String letter : splitS) {
            if (letterMap.containsKey(letter)) {
                int i = letterMap.get(letter) + 1;
                letterMap.put(letter, i);
            } else {
                letterMap.put(letter, 1);
            }
        }

        String[] splitT = t.split("");
        for (String letter : splitT) {
            if (letterMap.containsKey(letter)) {
                int i = letterMap.get(letter) - 1;
                if (i < 0) {
                    return false;
                } else if (i == 0) {
                    letterMap.remove(letter);
                } else {
                    letterMap.put(letter, i);
                }
            } else {
                return false;
            }
        }

        return letterMap.isEmpty();
    }
}
