class Solution {
    // ["encode", "decode"]
    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String elem : strs) {
            int length = elem.length();
            stringBuilder.append(length);
            stringBuilder.append("-");
            stringBuilder.append(elem);
        }
        return stringBuilder.toString();
    }
    // 6-encode6-decode

    // 6-encode6-decode
    public List<String> decode(String str) {
        List<String> stringList = new ArrayList<>();

        int index = 0;
        int len = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                len = Integer.parseInt(str.substring(index, i));
                index = i + 1;

                StringBuilder stringBuilder = new StringBuilder();

                while (len != 0) {
                    char c = str.charAt(index);
                    stringBuilder.append(c);
                    len--;
                    index++;
                }

                stringList.add(stringBuilder.toString());
            }
        }
        return stringList;
    }
    // ["encode", "decode"]
}
