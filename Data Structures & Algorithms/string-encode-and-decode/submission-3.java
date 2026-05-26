class Solution {
    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String elem : strs) {
            stringBuilder.append(elem.length()).append('#').append(elem);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> stringList = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + len;

            stringList.add(str.substring(i, j));

            i = j;
        }

        return stringList;
    }
}
