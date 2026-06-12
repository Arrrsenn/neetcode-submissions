class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> elems = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            min = Math.min(n, min);
            elems.add(n);
        }
        int longestCounter = 0;
        Set<Integer> maximum = new HashSet<>();
        int i = 0;
        while (i < elems.size()) {
            if (elems.contains(min)) {
                longestCounter++;
                min++;
                i++;
            } else {
                maximum.add(longestCounter);
                longestCounter = 0;
                min++;
            }
        }
        maximum.add(longestCounter);
        return maximum.stream().max(Comparator.naturalOrder()).get();
    }
}
